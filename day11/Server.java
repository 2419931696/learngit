package day11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 将聊天室服务端内容独立完成一次
 * 下面内容可以选做:
 * 配合客户端实现支持昵称与私聊功能
 * @author Xiloer
 *
 */
public class Server {
	private ServerSocket server;
	private ExecutorService es;
	private Map<String,PrintWriter> map;
	public Server() {
		System.out.println("正在启动服务端。。");
		try {
			server=new ServerSocket(8088);
			es=Executors.newFixedThreadPool(150);
			map=new HashMap<String,PrintWriter>();
			System.out.println("服务器启动成功");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void start(){
		while(true){
			System.out.println("正在等待客户端连接。。");
			try {
				while(true){
					Socket socket=server.accept();
					System.out.println("一个客户端连接了");
					ClientHandler handler=new ClientHandler(socket);
					es.execute(handler);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Server server=new Server();
		server.start();
	}
	private class ClientHandler implements Runnable{
		private Socket socket;
		public ClientHandler(Socket socket) {
			this.socket=socket;
		}
		@Override
		public void run() {
			BufferedReader br=null;
			PrintWriter pw=null;
			String nickname=null;
			try {
				br=new BufferedReader(new InputStreamReader//一条输入流
						(socket.getInputStream(),"utf-8"));
				pw=new PrintWriter(new BufferedWriter(//一条输出流
						new OutputStreamWriter(socket.getOutputStream(), "utf-8")),true);
				nickname=br.readLine();
				map.put(nickname, pw);//放入此用户的昵称和信息
				System.out.println("当前在线人数:"+map.size());
				while(true){
					String messege=br.readLine();
					System.out.println(nickname+"说："+messege);
					if(messege.startsWith("@")){//@呆呆 一起玩吗
						String arr[]=messege.split("\\s");
						String atName=arr[0].substring(1);//获得昵称
						map.get(atName).println(nickname+"偷偷的跟你说："+arr[1]);;
					}else{
						Set<Entry<String,PrintWriter>> entrySet=map.entrySet();
						for(Entry<String,PrintWriter> entry:entrySet){
							entry.getValue().println(nickname+"说："+messege);
						}
					}
				}
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println(nickname+"断开了连接");
			}finally{
				try {
					map.remove(nickname);
					System.out.println("当前在线人数："+map.size());
					br.close();
					pw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

