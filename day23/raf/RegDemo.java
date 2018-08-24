package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 完成注册用户操作
 * 程序启动后，要求用户输入:用户名，密码，昵称，年龄
 * 然后将该记录写入user.dat文件中。
 * 
 * 规划每条记录占用100字节
 * 其中:用户名，密码，昵称为字符串，各占32字节
 * 年龄为int值，占4个字节
 * 
 * 字符串通常在设计时，都会故意“留白”，长度相对固定。
 * 这样做好处是，第一:格式统一，便于操作指针读取每条记录
 * 第二:留有一定余量便于数据修改
 * 
 * @author adminitartor
 *
 */
public class RegDemo {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String username = scanner.nextLine();
		
		System.out.println("请输入密码:");
		String password = scanner.nextLine();
		
		System.out.println("请输入昵称:");
		String nickname = scanner.nextLine();
		
		System.out.println("请输入年龄:");
		int age = Integer.parseInt(
			scanner.nextLine()
		);
		
		RandomAccessFile raf
			= new RandomAccessFile("user.dat", "rw");
		//将指针移动到文件的末尾
		raf.seek(raf.length());
		
		
		//写用户名
		//1 先将用户名转换为一组字节
		byte[] data = username.getBytes("UTF-8");
		//2 将转换的字节数组扩容到32个字节
		data = Arrays.copyOf(data, 32);
		//3 将字节数组写入文件
		raf.write(data);
		
		//写密码
		data = password.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		
		//写昵称
		data = nickname.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		
		//写年龄
		raf.writeInt(age);
		System.out.println("注册完毕!");
		raf.close();
	}
}	













