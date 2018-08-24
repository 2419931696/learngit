package file;

import java.io.File;

/**
 * 创建一个目录
 * @author adminitartor
 *
 */
public class MkDirDemo {
	public static void main(String[] args) {
		/*
		 * 在项目目录下创建一个名为:demo的目录
		 * 
		 * 在相对路径中"./"可以忽略不写，默认就是从当前
		 * 目录开始
		 */
//		File dir = new File("./demo");
		File dir = new File("demo");
		if(!dir.exists()){
			dir.mkdir();
			System.out.println("目录已创建!");
		}else{
			System.out.println("目录已存在!");
		}
		
	}
}







