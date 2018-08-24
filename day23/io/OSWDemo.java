package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * java按照读写的数据单位将流划分为两大类:
 * 字节流，字符流
 * 字节流是以字节为单位读写数据的流，由于计算机底层都是
 * 2进制，所以字节流可以读写任意数据。
 * 
 * 字符流是以字符为单位读写数据的流，实际底层还是读写字节
 * 但是字符流会自动将字节与字符进行对应的转换工作，因此
 * 字符流天生具有字符编解码能力，对此字符流也仅适用于读写
 * 文本数据。
 * 
 * java.io.Reader,java.io.Writer它们是所有字符输入流
 * 与字符输出流的超类。规定了读写字符的相关方法。
 * 
 * 
 * 转换流
 * java.io.InputStreamReader,java.io.OutputStreamWriter
 * 它们是字符流常用的一对实现类，同时也是一对高级流。在流链
 * 接中起到非常重要的一环，承上启下，衔接字节流与其他字符流
 * 使用(因为低级流通常都是字节流，而读写字符时我们会使用功能
 * 更多的字符高级流，而字符流通常只能连接其他字符流)
 * 
 * @author adminitartor
 *
 */
public class OSWDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			= new FileOutputStream("osw.txt");
		
		OutputStreamWriter osw
			= new OutputStreamWriter(fos,"UTF-8");
		
		osw.write("我们一起学猫叫~");
		osw.write("一起喵喵喵喵喵~");
		
		System.out.println("写出完毕!");
		
		osw.close();
		
	}
}









