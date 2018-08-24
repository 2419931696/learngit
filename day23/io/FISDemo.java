package io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 文件输入流，读取文件数据
 * @author adminitartor
 *
 */
public class FISDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis 
			= new FileInputStream("fos.txt");
		
		byte[] data = new byte[1024];
		int len = fis.read(data);
		
		String string = new String(data,0,len,"UTF-8");
		System.out.println(string);
		
		fis.close();
		
		
		
	}
}








