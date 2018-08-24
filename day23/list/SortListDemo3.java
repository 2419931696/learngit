package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections提供了一个重载的sort方法，可以允许传入一
 * 个额外的比较器，按照该比较器的规则对元素比较大小后进行
 * 排序。
 * 1:排序方式可以自定，更灵活
 * 2:不要求元素必须实现Comparable接口，没有侵入性
 * @author adminitartor
 *
 */
public class SortListDemo3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("小泽老师");
		list.add("传奇");
		list.add("苍老师");		
		System.out.println(list);
//		Collections.sort(list);
		/*
		 * Comparator接口要求必须实现compare方法，该方法
		 * 是用来定义两个参数的大小关系。
		 * 当返回值>0时:o1>o2。返回值概念与Comparable接口
		 * 对应方法一致。
		 * 
		 */
		Collections.sort(list,new Comparator<String>(){
			public int compare(String o1, String o2) {	
				return o1.length()-o2.length();
			}	
		});
		System.out.println(list);
		
	}
}









