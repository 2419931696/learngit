package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 利用转换流测试字符流读取字符操作
 * @author adminitartor
 *
 */
public class ISRDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis
			= new FileInputStream("osw.txt");		
		InputStreamReader isr
			= new InputStreamReader(fis,"UTF-8");
		int d = -1;
		/*
		 * 字符流提供的读取字符操作:
		 * int read()
		 * 该方法会一次读取一个字符，具体实际读取了多少
		 * 字节取决于指定的字符集以及对应的字符(字符流
		 * 会自行判定)。
		 * 读取字符后还是以int形式返回，若该值为-1依然表
		 * 示流读取到了末尾。否则该数据表示的就是读取到的
		 * 对应字符，转换为char即可。
		 * 
		 */
		while((d = isr.read())!=-1){
			char c = (char)d;
			System.out.print(c);
		}
		isr.close();
		
	}
}








