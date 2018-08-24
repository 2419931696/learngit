package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流完成文件的复制操作
 * @author adminitartor
 *
 */
public class CopyDemo1 {
	public static void main(String[] args) throws IOException {
		/*
		 * 步骤:
		 * 1:创建文件输入流用于读取原文件
		 * 2:创建文件输出流用于写复制文件
		 * 3:顺序从原文件读取字节并写入到复制文件中
		 *   完成复制操作。
		 */
		FileInputStream fis	
			= new FileInputStream("movie.avi");
		FileOutputStream fos	
			= new FileOutputStream("movie_cp3.avi");
		byte[] data = new byte[1024*10];//10k
		int len = -1;
		while((len = fis.read(data))!=-1){
			fos.write(data,0,len);
		}
		System.out.println("复制完毕");
		fis.close();
		fos.close();
	}
}









