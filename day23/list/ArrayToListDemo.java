package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为集合
 * 数组的工具类:Arrays提供了一个静态方法:asList
 * 可以将一个数组转换为List集合
 * @author adminitartor
 *
 */
public class ArrayToListDemo {
	public static void main(String[] args) {
		String[] array = {"one","two","three","four"};
		
		List<String> list = Arrays.asList(array);
		System.out.println(list);
		/*
		 * 对集合元素操作就是对原数组对应元素操作
		 */
		list.set(1, "2");
		System.out.println(list);
		
		System.out.println("array:"+Arrays.toString(array));
		
		/*
		 * 集合增删元素会导致数组扩容或缩容，而数组本身是定长
		 * 的，所以既然数组转换的集合表示该数组，那么就不能增
		 * 删元素，否则会抛出异常。
		 */
//		list.add("five");
		
		/*
		 * 若想对集合元素增删，需要自行创建一个集合并包
		 * 含数组转换的集合中所有元素即可。
		 */
//		List<String> list2 = new ArrayList<String>();
//		list2.addAll(list);
		/*
		 * 所有集合都提供了一个参数为Collection类型的
		 * 构造方法，作用是在创建当前集合的同时包含给定
		 * 集合中的所有元素。所以下面这个实例化过程等同
		 * 上面两步。
		 */
		List<String> list2 = new ArrayList<String>(list);
		System.out.println("list2:"+list2);
		list2.add("five");
		System.out.println("list2:"+list2);
	}
}







