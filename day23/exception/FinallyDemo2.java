package exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * finally在IO中的使用
 * @author adminitartor
 *
 */
public class FinallyDemo2 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {		
			fos	= new FileOutputStream("fos.dat");
			fos.write(1);			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if(fos!=null){
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}







