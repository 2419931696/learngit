package file;

import java.io.File;

/**
 * 删除一个文件
 * @author adminitartor
 *
 */
public class DeleteFileDemo {
	public static void main(String[] args) {
		/*
		 * 将当前目录中的demo.txt文件删除
		 */
		File file = new File("./demo.txt");
		if(file.exists()){
			file.delete();
			System.out.println("文件已删除!");
		}else{
			System.out.println("文件不存在!");
		}
		
		
	}
}





