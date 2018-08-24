package exception;

import java.io.FileOutputStream;

/**
 * JDK7之后推出了一个新的特性:自动关闭
 * java中实现了AutoCloseable接口的类，都可以被该特性自
 * 动关闭 
 * @author adminitartor
 */
public class AutoCloseable {
	public static void main(String[] args) {	
		try(
			FileOutputStream fos
				= new FileOutputStream("fos.dat");
		){
			fos.write(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}









