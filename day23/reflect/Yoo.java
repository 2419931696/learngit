package reflect;

public class Yoo {
	
	@Test //标注自定义注解
	public void test(){
		System.out.println("test()");  
	}
	
	@Override
	@Test
	public String toString() {
		return super.toString();
	}
}
