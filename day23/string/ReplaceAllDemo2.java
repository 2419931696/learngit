package string;
/**
 * 和谐用语
 * @author adminitartor
 *
 */
public class ReplaceAllDemo2 {
	public static void main(String[] args) {
		String regex = "(wqnmlgdsb|mmp|sb|nc|tmd|mdzz|cnm|djb)";
		
		String message = "wqnmlgdsb!你这个sb!你怎么这么的nc!mdzz!你这个djb!";
		
		message = message.replaceAll(regex, "***");
		
		System.out.println(message);
		
		
		
	}
}





