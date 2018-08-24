package date;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * 计算商品的促销日期
 * 
 * 程序启动后，要求用户输入某商品的生产日期:yyyy-MM-dd
 * 以及保质期的天数
 * 然后经过程序计算，输出该商品的促销日期:yyyy-MM-dd
 * 
 * 促销日期规则:商品过期日前两周的周三
 * @author adminitartor
 *
 */
public class Test2 {
	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入生产日期:");
		String dateStr = scanner.nextLine();		
		System.out.println("请输入保质期天数:");
		int days = Integer.parseInt(scanner.nextLine());		
		//先将生产日期转换为Date
		SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd"
		);
		Date date = sdf.parse(dateStr);
		//使Calendar表示生产日期
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		//计算过期日
		calendar.add(Calendar.DAY_OF_YEAR, days);
		//计算前两周
		calendar.add(Calendar.DAY_OF_YEAR, -14);
		//设置为当周的周三
		calendar.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
		//得到促销日期
		date = calendar.getTime();
		System.out.println("该商品的促销日为:"+sdf.format(date));
		
		
	}
}










