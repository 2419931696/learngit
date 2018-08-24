package date;

import java.util.Calendar;

/**
 * void add(int field,int amount)
 * 对给定的时间分量加上给定的值，若给定的值为负数，则是
 * 减去对应的值
 * @author adminitartor
 *
 */
public class Calendar_add {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		/*
		 * 3年2个月零25天以后那天所在周的周三是哪天?
		 */
		//加上3年
		calendar.add(Calendar.YEAR, 3);
		//加上2个月
		calendar.add(Calendar.MONTH, 2);
		//加上25天
		calendar.add(Calendar.DAY_OF_YEAR, 25);
		System.out.println(calendar.getTime());	
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		
		System.out.println(calendar.getTime());
	}
}










