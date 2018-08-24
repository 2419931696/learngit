package map;

import java.util.HashMap;
import java.util.Map;

/**
 * Map也提供了对应的contains方法，并且可以分别判断包含
 * key和value
 * boolean containsKey(K k)
 * boolean containsValue(V v)
 * 
 * @author adminitartor
 *
 */
public class HashMapDemo2 {
	public static void main(String[] args) {
		Map<String, Integer> map 
			= new HashMap<String,Integer>();
		map.put("语文", 98);
		map.put("数学", 97);
		map.put("英语", 96);
		map.put("物理", 95);
		map.put("化学", 98);		
		System.out.println(map);
		/*
		 * key与value的包含关系也是依靠元素自身equals
		 * 方法比较的结果而定。
		 */
		boolean ck = map.containsKey("物理");
		System.out.println("包含key:"+ck);
		
		boolean cv = map.containsValue(95);
		System.out.println("包含value:"+cv);
	}
}












