package file;

import java.io.File;

/**
 * 删除目录
 * @author adminitartor
 *
 */
public class DeleteDirDemo {
	public static void main(String[] args) {
		/*
		 * 删除项目目录下的demo目录
		 * delete方法在删除目录时有一个前提条件，即：
		 * 目录必须是一个空目录才可以删除
		 */
		File dir = new File("demo");
		if(dir.exists()){
			dir.delete();
			System.out.println("目录已删除");
		}else{
			System.out.println("目录不存在!");
		}
		
	}
}







