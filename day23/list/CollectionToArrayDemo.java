package list;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合转换为数组操作
 * 
 * Collection提供了一个方法:toArray
 * 该方法可以将当前集合转换为一个数组。
 * @author adminitartor
 *
 */
public class CollectionToArrayDemo {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		
//		Object[] array = c.toArray();
		
		String[] array = c.toArray(new String[c.size()]);
		System.out.println(array.length);
		for(String str : array){
			System.out.println(str);
		}
	}
}








