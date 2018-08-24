package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 处理流，也称:高级流
 * 在IO操作中，通常我们会在低级流上连接一些高级流，这样
 * 当数据流经这些高级流时，它们可以对数据进行相应的加工
 * 处理，以简化我们对数据的相关操作。而这个过程，称为
 * 流链接操作。
 * 
 * 缓冲流
 * 缓冲流是一对高级流，作用是提高读写效率。
 * 缓冲流内部维护一个数组，无论我们做随机读写还是块读写
 * 操作，最终都会流经缓冲流时改变为块读写操作，从而提高
 * 了读写效率。
 * @author adminitartor
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis	 
			= new FileInputStream("movie.avi");
		//提高读取效率，可以连接缓冲输入流
		BufferedInputStream bis
			= new BufferedInputStream(fis);
		
		
		FileOutputStream fos 
			= new FileOutputStream("movie_cp4.avi");
		//连接缓冲字节输出流提高写出效率
		BufferedOutputStream bos
			= new BufferedOutputStream(fos);
		
		int d = -1;
		
		while((d = bis.read())!=-1){
			bos.write(d);
		}
		
		System.out.println("复制完毕!");
		/*
		 * 关闭流的时候，只需要关闭最外层高级流即可。
		 * 
		 */
		bis.close();
		bos.close();
	}
}













