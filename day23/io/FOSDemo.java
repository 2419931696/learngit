package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java 标准IO操作
 * IO指的是Input,Output. 即:输入与输出
 * 
 * 流按照方向实际是按照功能进行划分，参照方向是我们的程序
 * 输入流用于读取，即:从外界进入程序的过程，获取数据
 * 输出流用于写出，即:从程序发送到外界的过程，发送数据
 * 
 * 流划分为了两类:
 * 节点流，处理流
 * 节点流:又称为低级流，是真实连接程序与数据源的"管道"，
 *        负责实际搬运数据。读写一定是建立在节点流的基础
 *        上进行的。
 * 处理流:又称为高级流，高级流不能独立存在(没有意义)，一
 *        定是连接在其他流上使用的，目的是通过其连接的流
 *        将数据流经此流时对数据进行加工处理，从而简化我
 *        们实际对读写的数据加工的操作。
 * 在低级流的基础上通过组合多个高级流在读写过程中完成一系
 * 列的数据加工操作的过程，称为流的连接。这也是java标准
 * IO操作的精髓所在(学习重点就是学习如何组建流链接，完成
 * 一系列读写操作)
 * 
 * java.io.InputStream:所有字节输入流的超类，规定了所有
 * 输入流都应当具备的读取字节的相关方法。
 * 
 * java.io.OutputStream:所有字节输出流的超类，规定了所有
 * 输出流都应当具备的写出字节的相关方法。
 * 
 * 
 * 文件流:是一对低级流，用来读写文件数据。
 * java.io.FileInputStream:文件输入流，用来从文件中读取
 * 字节的流
 * java.io.FileOutputStream:文件输出流，用于向文件中写出
 * 字节的流
 *               
 * 论功能，与RandomAccessFile一致，但是RAF又能读又能写，
 * 而文件流要根据做读或写操作选取用输入或输出流进行。并且
 * 它们的底层实际读写操作是不一样的，RAF是基于指针对文件
 * 读写操作，所以可以通过操作指针进行部分覆盖写操作等，
 * 做到对文件数据编辑操作。但是流做不到,因为流是[顺序读写]
 * 操作。所以对于灵活性而言，RAF是优于文件流的。但是文件
 * 流基于IO操作可以通过连接不同高级流更轻松的完成复杂的读
 * 写操作。
 * 
 * 对于读写文件而言:
 * RAF是基于指针的读写，称为“随机读写”。可以移动指针对任意
 * 位置读写操作。
 * 文件流是流的读写方式，而流是“顺序读写”，只能顺序往后读写
 * 操作，是不能回退操作的。
 * 
 * @author adminitartor
 *
 */
public class FOSDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 文件输出流创建出来，默认为覆盖模式，
		 * 即:当操作的文件已经存在，那么在创建好文件输出
		 * 流时会先将该文件所有数据清除。然后通过该流写出
		 * 的所有数据作为文件数据。
		 * 
		 * 文件流还支持重载构造方法，在第一个参数基础上
		 * 可以再传入一个boolean类型的参数，当该值为true
		 * 时，则是追加模式。
		 * 即:文件原有数据全部保留，通过该流写出的数据会被
		 * 追加到文件末尾。
		 * 
		 */
		FileOutputStream fos
			= new FileOutputStream("fos.txt",true);
		
//		String line = "我本是王母娘娘身边的一员天庭大将啊~";
		String line = "只因为犯下天条被逐落人间，";
		byte[] data = line.getBytes("UTF-8");
		fos.write(data);
		
		line = "我才流浪世间.";
		data = line.getBytes("UTF-8");
		fos.write(data);
			
		System.out.println("写出完毕!");
		fos.close();
		
	}
}











