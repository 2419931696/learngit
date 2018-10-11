package day11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 将聊天室客户端内容独立完成一次.
 * 下面内容可以选做:
 * 修改代码，使聊天室可以实现用户自定义昵称，
 * 以及私聊功能。
 * 
 * 参考思路:
 * 客户端连接服务端后，要求用户输入一个昵称，
 * 然后将改昵称发送给服务端，服务端那边读取到
 * 客户端发送的第一个字符串认为是昵称。
 * 
 * 私聊功能可以定义格式，例如:
 * @张三:你好
 * 服务端在读取客户端发送过来的昵称时，需要进行
 * 解析，分解出昵称与聊天内容，然后将该聊天内容
 * 单独发送给指定昵称的用户。
 * 服务端的输出流需要使用Map进行维护，而不能再
 * 使用List，Map的key可以是该用户昵称，value
 * 为该用户输出流。
 * 
 * 
 * @author Xiloer
 *
 */
public class Client {
	/*
	 *需求：1.用户可以自定义昵称
	 *2.私聊功能 
	 */
	private Socket socket;
	public Client() {
		System.out.println("正在启动客户端。。。");
		try {
			socket=new Socket("localhost",8088);
			System.out.println("客户端启动成功");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void start(){
		System.out.println("请输入昵称");
		Scanner sc=new Scanner(System.in);
		String nickname=sc.nextLine();
		ServerHandler handler=new ServerHandler(socket);
		new Thread(handler).start();//启动线程读取客户端消息
		try {
			PrintWriter pw=new PrintWriter(new BufferedWriter(//一条输出流
					new OutputStreamWriter(socket.getOutputStream(), "utf-8")),true);
			pw.println(nickname);
			while(true){
				System.out.println("请输入您要讲的话");
				pw.println(sc.nextLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Client client=new Client();
		client.start();
	}
}
/*
 * 服务端处理小程序，可以启动线程读取客户端发过来的消息
 */
class ServerHandler implements Runnable{
	private Socket socket;
	public ServerHandler(Socket socket) {
		this.socket=socket;
	}
	@Override
	public void run() {
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
			while(true){
				System.out.println(br.readLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}