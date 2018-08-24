package file;

import java.io.File;
import java.io.IOException;

/**
 * 使用File创建一个新文件
 * @author adminitartor
 *
 */
public class CreateNewFileDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 在项目目录下创建一个名为：demo.txt的文件
		 * 1:先创建一个File表示该文件
		 * 2:判断该文件是不存在的
		 * 3:创建该文件
		 */
		//1
		File file = new File("./demo.txt");
		//2
		if(!file.exists()){
			file.createNewFile();
			System.out.println("文件已创建!");
		}else{
			System.out.println("文件已存在!");
		}
		
		
	}
}






