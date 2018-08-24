package date;

import java.util.Date;

/**
 * java.util.Date
 * Date的每一个实例用于表示一个确切的时间点。内部维护
 * 一个long值，该值是UTC时间(1970年1月1日00:00:00)到
 * 当前Date表示的时间之间所经过的毫秒。
 * 
 * 由于Date存在时区以及千年虫问题，所以大部分的方法在
 * JDK1.1版本推出时就被声明为过时的，而这些操作时间的
 * 方法都被Calendar的相关方法取代。
 * @author adminitartor
 *
 */
public class DateDemo {
	public static void main(String[] args) {
		//默认创建表示当前系统时间
		Date date = new Date();
		
		System.out.println(date);
		
//		date.getYear();
		/*
		 * long getTime()
		 * 获取Date内部维护的long值
		 */
		long time = date.getTime();
		System.out.println(time);
		
		time = time+1000*60*60*24;
		/*
		 * void setTime(long time)
		 * 设置一个long值，使Date表示该日期
		 */
		date.setTime(time);
		System.out.println(date);
		
	}
}









