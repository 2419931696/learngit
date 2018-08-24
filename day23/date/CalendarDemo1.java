package date;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar 日历类
 * Calendar本身是一个抽象类，不可以实例化，但是提供了
 * 一个实现的静态方法:getInstance，可以根据当前系统所在
 * 地区获取一个适用的实现类实例，大部分读取获取回来的都
 * 是GregorianCalendar，即:阳历
 * 
 * @author adminitartor
 *
 */
public class CalendarDemo1 {
	public static void main(String[] args) {
		//获取的Calendar默认表示当前系统时间
		Calendar calendar = Calendar.getInstance();
		//Calendar的toString不能直观反映出具体表示的日期
		System.out.println(calendar);
		/*
		 * Date getTime()
		 * Calendar的getTime方法可以将其表示的时间以
		 * 一个Date实例形式返回。
		 * Calendar->Date
		 */
		Date date = calendar.getTime();
		System.out.println(date);
		
		/*
		 * void setTime(Date date)
		 * 使当前Calendar表示给定的Date所表示的日期
		 * Date->Calendar
		 */
		calendar.setTime(date);
		
		
	}
}








