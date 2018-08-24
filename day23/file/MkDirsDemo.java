package file;

import java.io.File;

/**
 * 创建一个多级目录
 * @author adminitartor
 *
 */
public class MkDirsDemo {
	public static void main(String[] args) {
		/*
		 * 在当前目录下创建目录:a/b/c/d/e/f
		 * 
		 * mkdir在创建目录时要求其所在的父目录必须存在
		 * 否则创建不成功，而mkdirs则会将所有不存在的父
		 * 目录自动创建出来。
		 */
		File dir = new File("a/b/c/d/e/f");
		if(!dir.exists()){
			dir.mkdirs();
			System.out.println("创建完毕!");
		}else{
			System.out.println("目录已存在!");
		}
		
		
	}
}







