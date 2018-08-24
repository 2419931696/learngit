package raf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * 专门用来读写文件数据的类，其读写是基于指针进行的，即:
 * RAF总是在指针指向位置读取或者写出字节。
 * 
 * RAF有两种常用的模式:
 * r:只读模式，只能读取文件数据，不可以做写操作。
 * rw:读写模式，即可读也可写。
 * @author adminitartor
 *
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 对项目目录下的文件test.dat文件进行读写操作
		 * 
		 * RandomAccessFile(String path, String mode)
		 * RandomAccessFile(File file, String mode)
		 * 
		 */
		RandomAccessFile raf 
			= new RandomAccessFile("test.dat", "rw");
		System.out.println("raf已创建!");
		
		
		/*
		 * void write(int d)
		 * 该方法可以向文件中写入一个字节，写入的是
		 * 给定的int值所对应的2进制的"低八位". 
		 *                            vvvvvvvv
		 * 00000000 00000000 00000001 00000001
		 */
		raf.write(1);		
		System.out.println("写出完毕!");
		
		raf.close();
		
	}
}














