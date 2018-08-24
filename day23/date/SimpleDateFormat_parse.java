package date;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * ½«×Ö·û´®½âÎöÎªDate
 * @author adminitartor
 *
 */
public class SimpleDateFormat_parse {
	public static void main(String[] args) throws ParseException {
		String line = "2008-08-08 20:08:08";
		
		SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss"	
		);
		
		Date date = sdf.parse(line);
		
		System.out.println(date);
	}
}








