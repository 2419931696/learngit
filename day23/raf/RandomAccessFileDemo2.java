package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RAF基于指针的读写操作以及RAF读写基本类型数据的操作
 * @author adminitartor
 *
 */
public class RandomAccessFileDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			= new RandomAccessFile("raf.dat", "rw");
		/*
		 * 获取raf当前指针位置，RAF刚创建时是在文件最
		 * 开始，对应的位置为0.
		 */
		long pos = raf.getFilePointer();
		System.out.println("pos:"+pos);
		
		/*
		 * 向文件中写入一个int最大值
		 *                            vvvvvvvv
		 * 01111111 11111111 11111111 11111111
		 * 
		 * max>>>24
		 * 00000000 00000000 00000000 01111111
		 */
		int max = Integer.MAX_VALUE;		
		raf.write(max>>>24);
		System.out.println("pos:"+raf.getFilePointer());
		
		
		raf.write(max>>>16);
		raf.write(max>>>8);
		raf.write(max);
		System.out.println("pos:"+raf.getFilePointer());
		
		
		/*
		 * void writeInt(int d)
		 * 将给定的int值的4个字节一次性写入文件，等同
		 * 上面的4次write操作
		 */
		raf.writeInt(max);
		System.out.println("pos:"+raf.getFilePointer());
		
		/*
		 * RAF提供了所有基本类型的写出操作
		 */
		raf.writeLong(123L);
		System.out.println("pos:"+raf.getFilePointer());
		
		raf.writeDouble(123.123);
		System.out.println("pos:"+raf.getFilePointer());
		
		System.out.println("写出完毕!");
		
		/*
		 * 操作指针
		 * 
		 * void seek(long pos)
		 * 将指针移动到指定位置
		 * 
		 */
		raf.seek(0);
		System.out.println("pos:"+raf.getFilePointer());
		/*
		 * raf也提供了读取基本类型的相关方法
		 */
		int d = raf.readInt();
		System.out.println(d);//max
		System.out.println("pos:"+raf.getFilePointer());
		
		//读取long
		//1将指针移动到long的第一个字节位置
		raf.seek(8);
		//2连续读取8个字节
		long l = raf.readLong();
		System.out.println(l);
		
		double dou = raf.readDouble();
		System.out.println(dou);
		//指针应当再次到达文件末尾
		System.out.println("pos:"+raf.getFilePointer());
		
		/*
		 * 当调用readInt这样的方法过程中发现读取到了文件
		 * 末尾时，会抛出EOFException表示文件末尾。
		 * EOF end of file
		 */
//		d = raf.readInt();
//		System.out.println(d);
		
		raf.close();
	}
}














