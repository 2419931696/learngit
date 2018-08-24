package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 聊天室服务端
 * @author adminitartor
 *
 */
public class Server {
	/*
	 * 运行在服务端的ServerSocket主要有两个作用:
	 * 1:向系统申请服务端口，客户端就是通过这个端口与
	 *   服务端建立链接的。
	 * 2:监听服务端口，一旦客户端与服务端建立链接，就会
	 *   自动创建一个Socket，并通过该Socket与建立链接的
	 *   客户端进行交互。  
	 */
	private ServerSocket server;
	
	/*
	 * 保存每个ClientHandler对应客户端的输出流，用于
	 * 广播消息
	 */
//	private PrintWriter[] allOut = {};
	private List<PrintWriter> allOut 
				= new ArrayList<PrintWriter>();
	
	public Server(){
		try {
			/*
			 * 实例化ServerSocket的同时申请服务端口
			 */
			System.out.println("正在启动服务端...");
			server = new ServerSocket(8088);
			System.out.println("服务端启动完毕!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void start(){
		try {
			while(true){
				System.out.println("等待客户端连接...");
				Socket socket = server.accept();
				System.out.println("一个客户端连接了");
				/*
				 * 启动一个线程来处理该客户端的交互
				 */
				Runnable clientHandler = new ClientHandler(socket);
				Thread thread = new Thread(clientHandler);
				thread.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}
	
	/**
	 * 该线程的任务是处理与指定客户端的交互工作
	 * @author adminitartor
	 *
	 */
	private class ClientHandler implements Runnable{
		private Socket socket;
		//客户端的地址信息
		private String host;
		
		
		public ClientHandler(Socket socket){
			this.socket = socket;
			//通过socket获取远端计算机的地址信息
			InetAddress address = socket.getInetAddress();
			//获取IP地址的字符串形式:xxx.xxx.xxx.xxx
			host = address.getHostAddress();
			
		}
		
		public void run(){
			PrintWriter pw = null;
			try {
				InputStream in = socket.getInputStream();
				InputStreamReader isr
					= new InputStreamReader(in,"UTF-8");
				BufferedReader br
					= new BufferedReader(isr);
				
				//获取输出流，用于给客户端发送消息
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw
					= new OutputStreamWriter(out, "UTF-8");
				BufferedWriter bw
					= new BufferedWriter(osw);
				
				pw = new PrintWriter(bw,true);
				/*
				 * 将该输出流存入共享数组allOut,便于其他的
				 * ClientHandler实例也可以访问当这个输出流
				 * 从而给该客户端发送消息。
				 * 
				 * 多个线程不能同时向allOut数组中添加元素，否则
				 * 会出现并发安全
				 */
				synchronized (allOut) {
					//1对allOut数组扩容
//					allOut = Arrays.copyOf(allOut, allOut.length+1);	
//					//2将该输出流存入数组最后一个位置
//					allOut[allOut.length-1] = pw;
					
					allOut.add(pw);
				}
				
				
				String message = null;
				while((message = br.readLine())!=null){		
					System.out.println(host+":"+message);
					synchronized (allOut) {
						//遍历allOut，给所有客户端发送该消息
//						for(int i=0;i<allOut.length;i++){
//							allOut[i].println(host+":"+message);
//						}
						for(PrintWriter p : allOut){
							p.println(host+":"+message);
						}
					}
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally{
				//处理客户端断开连接后的操作
				/*
				 * 1 将当前客户端对应的输出流从allOut 
				 *   数组中删除
				 */
				synchronized (allOut) {
//					for(int i=0;i<allOut.length;i++){
//						if(allOut[i]==pw){
//							//将最后一个元素设置到该位置
//							allOut[i] = allOut[allOut.length-1];
//							allOut = Arrays.copyOf(allOut, allOut.length-1);
//							break;
//						}
//					}
					allOut.remove(pw);
				}
				
				/*
				 * 2将该Socket关闭，释放资源
				 */
				try {
					socket.close();
				} catch (IOException e) {
				}
			}
		}
	}
	
	
}








