package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 文件复制操作
 * @author adminitartor
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 1:创建一个RAF用于读取原文件
		 * 2:创建一个RAF用于写入复制文件
		 * 3:循环从原文件读取每一个字节并写入到复制文件
		 *   中完成copy工作
		 */
		//1
		RandomAccessFile src
			= new RandomAccessFile("movie.avi", "r");
		//2
		RandomAccessFile desc
			= new RandomAccessFile("movie_cp.avi","rw");
		//3
		int d = -1;
		long start = System.currentTimeMillis();
		while((d = src.read())!=-1){
			desc.write(d);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制完毕!耗时:"+(end-start)+"ms");
		src.close();
		desc.close();
		
	}
}







