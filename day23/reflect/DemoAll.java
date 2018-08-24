package reflect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 实现一个工具，自动执行标注了@Test的方法 
 */
public class DemoAll {

	@Test
	public void demo01(){
		List<String> list=new ArrayList<>();
		list.add("Tom");
		list.add("Jerry");
		list.add("熊大");
		System.out.println(list); 
	}

	@Test
	public void demo02(){
		List<String> list=new LinkedList<>();
		list.add("Tom");
		list.add("Jerry");
		list.add("熊大");
		System.out.println(list); 
	}

	@Test
	public void abc(){
		System.out.println("Hello  World!"); 
	}
	
	@Test 
	public void str01(){
		String str = "anc123";
		String s = str.toUpperCase();
		System.out.println(s); 
	}
	
}








