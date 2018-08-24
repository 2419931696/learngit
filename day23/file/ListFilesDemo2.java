package file;

import java.io.File;
import java.io.FileFilter;

/**
 * File提供了一个重载的listFiles方法，可以传入一个文件
 * 过滤器，然后只将该目录中满足过滤器要求的子项返回。
 * @author adminitartor
 *
 */
public class ListFilesDemo2 {
	public static void main(String[] args) {
		/*
		 * 获取项目目录下所有名字是以"."开头的子项
		 */
		File dir = new File(".");
//		FileFilter filter = new MyFilter();
		/*
		 * 使用匿名内部类形式创建文件过滤器
		 * 过滤条件为:只获取文件。
		 */
		FileFilter filter = new FileFilter(){
			public boolean accept(File file) {
				return file.isFile();
			}
			
		};
		
		File[] subs = dir.listFiles(filter);
		for(int i=0;i<subs.length;i++){
			System.out.println(subs[i].getName());
		}
	}
}

//class MyFilter implements FileFilter{
//	public boolean accept(File file) {
//		String name = file.getName();
//		System.out.println("正在过滤:"+name);
//		return name.startsWith(".");
//	}
//	
//}








