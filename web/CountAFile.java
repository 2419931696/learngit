package web;

import java.io.RandomAccessFile;
import java.util.Scanner;
/**
 * �ṩ��һ�����������ļ�·������ַ������ķ���
 * @author Administrator
 *
 */
public class CountAFile {
	/**
	 * ��װ��һ������·�����Զ�ȡ�ļ��ķ���
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
