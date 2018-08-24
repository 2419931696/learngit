package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
/**
 * 聊天室客户端
 * @author adminitartor
 *
 */
public class Client {
	/**
	 * 套接字
	 * 封装了TCP协议的通讯细节，让我们可以简单的使用它
	 * 完成TCP通讯。
	 * Socket连接后提供了两条流，通过两条流的读写操作
	 * 完成与远端计算机的数据交换。
	 */
	private Socket socket;
	/**
	 * 用来初始化客户端
	 */
	public Client(){
		try {
			/*
			 * 实例化Socket时需要传入两个参数:
			 * 1:服务端的IP地址
			 * 2:服务端的端口号
			 * 通过IP地址可以找到服务端所在的计算机，通
			 * 过端口可以找到运行在服务端计算机上的服务端
			 * 应用程序
			 * 注意，实例化Socket的过程就是连接的过程，若
			 * 连接失败会抛出异常
			 * 
			 */
			System.out.println("正在连接服务端...");
			BufferedReader br = new BufferedReader(
				new InputStreamReader(
					new FileInputStream("config.txt")
				)	
			);
			String host = br.readLine();
			int port = Integer.parseInt(br.readLine());
			
			socket = new Socket(host, port);
			System.out.println("与服务端建立连接!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 客户端开始工作的方法
	 */
	public void start(){
		try {
			//先启动读取服务端消息的线程
			ServerHandler handler = new ServerHandler();
			Thread thread = new Thread(handler);
			thread.start();
			
			
			/*
			 * Socket提供的方法
			 * OutputStream getOutputStream()
			 * 该方法获取一个字节输出流，通过该流写出的
			 * 数据会发送给远端计算机 
			 */
			OutputStream out 
				= socket.getOutputStream();
			OutputStreamWriter osw
				= new OutputStreamWriter(out,"UTF-8");
			BufferedWriter bw
				= new BufferedWriter(osw);
			PrintWriter pw
				= new PrintWriter(bw,true);
			
		
			Scanner scanner = new Scanner(System.in);
			while(true){
				String line = scanner.nextLine();
				pw.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Client client = new Client();
		client.start();
	}
	
	/**
	 * 该线程负责循环读取服务端发送过来的消息
	 * @author adminitartor
	 *
	 */
	private class ServerHandler implements Runnable{
		public void run(){
			try {
				//获取输入流，读取服务端发送过来的消息
				InputStream in = socket.getInputStream();
				InputStreamReader isr
					= new InputStreamReader(in,"UTF-8");
				BufferedReader br
					= new BufferedReader(isr);
				
				String line = null;
				while((line = br.readLine())!=null){
					System.out.println(line);
				}
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}



















