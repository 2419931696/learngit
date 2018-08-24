package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * 可以按照一个指定的日期格式将Date与String进行相互转换。
 * @author adminitartor
 *
 */
public class SimpleDateFormat_format {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		/*
		 * 2018-08-21 10:31:22
		 * yyyy-MM-dd HH:mm:ss
		 */
		SimpleDateFormat sdf
			= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a E");
		/*
		 * String format(Date date)
		 * 将给定的Date按照当前SDF指定的日期格式转换
		 * 为字符串
		 * 
		 */
		String line = sdf.format(date);
		System.out.println(line);
	}
}









