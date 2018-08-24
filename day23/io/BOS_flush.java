package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲输出流的缓冲区问题
 * @author adminitartor
 *
 */
public class BOS_flush {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			= new FileOutputStream("bos.txt");
		BufferedOutputStream bos
			= new BufferedOutputStream(fos);
		
		String line = "我是隔壁的泰山，抓住爱情的藤蔓，听我说!嗷~~~~~";		
		byte[] data = line.getBytes("UTF-8");
		
		bos.write(data);
		/*
		 * void flush()
		 * 缓冲流的flush方法用于强制将缓冲区中已缓存的
		 * 数据进行一次性写出。
		 * 频繁的调用flush方法会降低写效率，但是能保证
		 * 写出数据的即时性。
		 */
//		bos.flush();
		System.out.println("写出完毕!");
		//缓冲流在关闭时会自动进行一次flush操作
		bos.close();
		
	}
}












