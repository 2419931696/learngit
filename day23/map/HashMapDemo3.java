package map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map的遍历操作
 * 遍历一个Map有三种方式:
 * 遍历所有的key
 * 遍历所有的key-value对
 * 遍历所有的value(相对不常用)
 * 
 * @author adminitartor
 *
 */
public class HashMapDemo3 {
	public static void main(String[] args) {
//		Map<String, Integer> map 
//			= new HashMap<String,Integer>();
		/*
		 * LinkedHashMap允许遍历顺序与put元素时的顺序
		 * 一致。
		 */
		Map<String, Integer> map 
			= new LinkedHashMap<String,Integer>();
		map.put("语文", 98);
		map.put("数学", 97);
		map.put("英语", 96);
		map.put("物理", 95);
		map.put("化学", 98);		
		System.out.println(map);
		/*
		 * Set<K> keySet()
		 * 该方法会将当前Map中所有的元素以一个Set集合
		 * 形式返回，遍历该集合就等同遍历了所有的key
		 */
		Set<String> keySet = map.keySet();
		for(String key : keySet){
			System.out.println("key:"+key);
		}
		
		
		/*
		 * 遍历每一组键值对
		 * Set<Entry> entrySet()
		 * 该方法会将当前Map中每一组键值对(若干Entry实例)
		 * 以一个Set集合形式返回。
		 * 
		 * java.util.Map.Entry
		 * Entry是Map的一个内部接口，其实现类的每一个实例
		 * 用于表示当前Map的一组键值对。该接口规定了获取
		 * 其表示的这组键值对的key与value的方法。
		 * K getKey()
		 * V getValue()
		 * 不同的Map都实现了Entry，并用实现类实例表示其
		 * 每一组键值对，HashMap也一样。
		 */
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry : entrySet){
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+":"+value);
		}
		
		/*
		 * Collection<V> values()
		 * 遍历所有的value返回的是一个Collection，并非
		 * 一个Set集合，因为Map并不要求value不允许重复。
		 */
		Collection<Integer> values = map.values();
		for(Integer value : values){
			System.out.println("value:"+value);
		}
		
	}
	
}












