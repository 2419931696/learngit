package date;

import java.util.Calendar;

/**
 * Calendar可以获取各个时间分量的值
 * int get(int field)
 * 不同的时间分量用不同的数字表示，这些数字无需记忆，
 * Calendar都提供了对应的常量
 * @author adminitartor
 *
 */
public class Calendar_get {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//获取年
		int year = calendar.get(Calendar.YEAR);
		//获取月(月从0开始)
		int month = calendar.get(Calendar.MONTH)+1;
		/*
		 * 获取日
		 * 和"天"相关的常量有:
		 * DAY_OF_WEEK   周中的天
		 * DAY_OF_MONTH  月中的天
		 * DAY_OF_YEAR   年中的天 
		 * DATE          月中的天，与DAY_OF_MONTH一致
		 */
		int day = calendar.get(Calendar.DAY_OF_MONTH);
//		int day = calendar.get(Calendar.DATE);
		System.out.println(year+"-"+month+"-"+day);
		
		/*
		 * 获取时分秒
		 */
		int h = calendar.get(Calendar.HOUR_OF_DAY);
		int m = calendar.get(Calendar.MINUTE);
		int s = calendar.get(Calendar.SECOND);
		System.out.println(h+":"+m+":"+s);
	
		//周几?
		int dow = calendar.get(Calendar.DAY_OF_WEEK);
		String[] data = {"日","一","二","三","四","五","六"};
		System.out.println("周"+data[dow-1]);
		
		//今年的第几天?
		int doy = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("今天是今年的第"+doy+"天");
		//获取给定时间分量所允许的最大值
		int days = calendar.getActualMaximum(
			Calendar.DAY_OF_YEAR);
		System.out.println("今年共"+days+"天");
		
		
		
	}
}












