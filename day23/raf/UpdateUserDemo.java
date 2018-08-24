package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.RandomAccess;
import java.util.Scanner;

/**
 * 修改昵称
 * 输入要修改昵称的用户的用户名，然后将该用户的昵称修改
 * 若输入的用户名无效，则做出提示。
 * @author adminitartor
 *
 */
public class UpdateUserDemo {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String username = scanner.nextLine();
		System.out.println("请输入新的昵称:");
		String nickname = scanner.nextLine();
		
		RandomAccessFile raf 
			= new RandomAccessFile("user.dat", "rw");
		
		boolean have = false;//默认无此人
		for(int i=0;i<raf.length()/100;i++){
			//移动指针到该记录用户名的位置
			raf.seek(i*100);	
			//先读取用户名
			byte[] data = new byte[32];
			raf.read(data);
			String name = new String(data,"UTF-8").trim();
			//判断是否是要修改的用户
			if(name.equals(username)){
				//修改昵称
				//1先移动指针到该条记录昵称的位置
				raf.seek(i*100+64);
				//2将新的昵称以32字节形式写入该位置
				byte[] nickArr = nickname.getBytes("UTF-8");
				nickArr = Arrays.copyOf(nickArr, 32);
				raf.write(nickArr);
				System.out.println("修改完毕!");
				have = true;
				break;
			}
		}
		if(!have){
			System.out.println("无此用户!");
		}
		raf.close();
		
	}
}












