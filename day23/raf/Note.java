package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 简易记事本工具
 * 
 * 程序启动后，要求用户输入一个文件的名字，然后对该
 * 文件进行写操作。
 * 之后用户在控制台输入的每行字符串都顺序写入到该文件
 * 中。
 * 当用户输入"exit"时，程序退出。
 * @author adminitartor
 *
 */
public class Note {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入文件名:");
		String fileName = scanner.nextLine();		
		RandomAccessFile raf
			= new RandomAccessFile(fileName, "rw");	
		System.out.println("请开始输入内容:");	
		while(true){
			String line = scanner.nextLine();
			if("exit".equals(line)){
				break;
			}
			raf.write(line.getBytes("UTF-8"));
		}		
		System.out.println("再见!");
		raf.close();
		
	}
}










