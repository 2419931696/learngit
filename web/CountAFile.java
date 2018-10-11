package web;

import java.io.RandomAccessFile;
import java.util.Scanner;
/**
 * 提供了一个可以输入文件路径输出字符数量的方法
 * @author Administrator
 *
 */
public class CountAFile {
	/**
	 * 封装了一个输入路径可以读取文件的方法
	 * @param url
	 */
	public static void CountAfile(String url){
		Scanner sc=new Scanner(System.in);
		try(RandomAccessFile raf=new RandomAccessFile(sc.nextLine(), "r")){
			int len=-1;
			while((len=raf.read())!=-1){
				System.out.println(len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			sc.close();
		}
	}
	public static void main(String[] args) {
		CountAfile(null);
	}
}
