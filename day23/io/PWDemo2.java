package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 在流链接中使用PW
 * @author adminitartor
 *
 */
public class PWDemo2 {
	public static void main(String[] args) throws IOException {
		/*
		 * 使用流链接形式向文件中写出字符串
		 */
		FileOutputStream fos
			= new FileOutputStream("pw2.txt");		
		OutputStreamWriter osw
			= new OutputStreamWriter(fos, "UTF-8");		
		BufferedWriter bw
			= new BufferedWriter(osw);		
		PrintWriter pw
			= new PrintWriter(bw);
		
		pw.println("你好!");
		pw.println("再见!");
		
		pw.close();
	}
}








