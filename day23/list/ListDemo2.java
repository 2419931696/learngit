package list;

import java.util.ArrayList;
import java.util.List;

/**
 * List提供的另一组通过下标操作元素的方法:
 * set,get
 * @author adminitartor
 *
 */
public class ListDemo2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);	
		
		/*
		 * E get(int index)
		 * 获取指定位置对应的元素
		 */
		String str= list.get(1);
		System.out.println(str);
		
		//普通循环也可以遍历List集合
		for(int i=0;i<list.size();i++){
			str = list.get(i);
			System.out.println(str);
		}
		
		/*
		 * E set(int index,E e)
		 * 将给定元素设置到指定位置，返回值为原位置对应
		 * 的元素(替换元素操作)
		 */
		String old = list.set(1, "2");
		System.out.println(list);
		System.out.println("old:"+old);
		
		
		
	}
}






