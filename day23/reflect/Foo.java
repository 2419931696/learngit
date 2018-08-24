package reflect;

public class Foo {
	int a = 5;
	
	public void test() {
		System.out.println("test()");
	}
	
	private void demo() {
		System.out.println("demo()");
	}
	
	public int demo(int n, String s){
		System.out.println("demo(int, String)");
		return n+s.length();
	}
	public int test(int n, String s){
		System.out.println("test(int, String)");
		return n+s.length();
	}
	public double test(double n, String s){
		System.out.println("test(double,String)"); 
		return n+s.length();
	}
}








