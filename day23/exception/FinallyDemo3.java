package exception;
/**
 * finally常见面试题
 * 
 * 请分别说明:final,finally,finalize
 * finalize是Object定义的方法，该方法是被GC执行的方法，
 * 当一个对象即将被GC释放前，GC会调用该方法。调用该方法
 * 完毕后意味着该对象即被释放。
 * 
 * @author adminitartor
 *
 */
public class FinallyDemo3 {
	public static void main(String[] args) {
		System.out.println(
			test("0")+","+test(null)+","+test("")	
		);
		// ?,?,?
	}
	
	public static int test(String str){
		try {
			System.out.println("开始执行test");
			return str.charAt(0)-'0';
		} catch (NullPointerException e) {
			System.out.println("出现了空指针");
			return 1;
		} catch (Exception e){
			System.out.println("出现了其它异常");
			return 2;
		} finally{
			System.out.println("finally执行了");
			return 3;
		}
		
	}
}











