package file;

import java.io.File;

/**
 * 1:请编写一段代码，完成1+2+3+4+....100，并输出结果。
 *   在这段代码中不得出现for,while关键字。
 *   
 * 2:买汽水，1块钱1瓶汽水，2个空瓶可以换一瓶汽水，3个瓶
 *   盖可以换一瓶汽水，问：20块钱可以喝多少瓶汽水?   
 *   
 * 
 * 
 * 
 * 
 * 完成方法，删除给定的File表示的文件或目录
 * @author adminitartor
 *
 */
public class Test {
	public static void main(String[] args) {
		File file = new File("a");
		delete(file);
	}
	/**
	 * 递归调用
	 * 所谓递归的现象就是在当前方法内部再次调用当前方法
	 * 的现象称为递归调用。
	 * 递归也用来重复执行某个工作，但是与for，while不同
	 * 它是可以将整个方法重头再来。
	 * 递归性能差，并且消耗资源大，如果可以尽量避免使用。
	 * 递归调用一定是在一个分支中被控制的，若方法内部一定
	 * 再次调用该方法，那么是一个死循环。
	 * 
	 * 
	 * @param file
	 */
	public static void delete(File file){
		/*
		 * 首先判断当前File表示的是否文件还是目录
		 */
		if(file.isDirectory()){
			//先清空该目录
			//1获取该目录下所有子项
			File[] subs = file.listFiles();
			//2遍历数组，将每个子项删除
			for(int i=0;i<subs.length;i++){
				File sub = subs[i];
				delete(sub); 
			}
		}
		file.delete();
		
	}
}






