package file;

import java.io.File;

/**
 * 访问一个目录中的所有子项
 * @author adminitartor
 *
 */
public class ListFilesDemo {
	public static void main(String[] args) {
		/*
		 * 获取当前目录中的所有子项
		 */
		File dir = new File(".");
		/*
		 * boolean isFile()
		 * 判断当前File表示的是否为一个文件
		 * 
		 * boolean Directory()
		 * 判断当前File表示的是否为一个目录
		 */
		if(dir.isDirectory()) {
			//获取所有子项
			File[] subs = dir.listFiles();
			for(int i=0;i<subs.length;i++){
				File sub = subs[i];
				System.out.println(sub.getName());
			}
		}
		
		
	}
}











