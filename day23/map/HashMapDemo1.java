package map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map 接口
 * Map 查找表
 * Map结构的样子是一个多行两列的表格，左列称为key，右列
 * 称为value，Map总是以key-value对的形式保存一组数据。
 * 并且获取信息是根据key查找对应的value。
 * 
 * 常用实现类:HashMap。散列表，使用散列算法实现的Map，
 *           当今查询速度最快的数据结构。
 * 
 * 
 * @author adminitartor
 *
 */
public class HashMapDemo1 {
	public static void main(String[] args) {
		Map<String, Integer> map 
			= new HashMap<String,Integer>();
		/*
		 * V put(K k,V v)
		 * 向当前Map中存放指定的key-value对。
		 * Map有一个要求，key不允许重复，是否重复也是
		 * 依靠key自身equals比较的结果。
		 * 如果以Map中已有的key存入key-value对则是替换
		 * value操作。那么返回值为被替换的value，否则
		 * 是null。
		 */
		map.put("语文", 98);
		map.put("数学", 97);
		map.put("英语", 96);
		map.put("物理", 95);
		map.put("化学", 98);		
		System.out.println(map);
		/*
		 * 如果value是包装类，那么注意，接收put方法返回
		 * 值时要使用包装类接收，切记不要直接用基本类型
		 * 因为编译器会添加自动拆箱的操作，如果put方法
		 * 返回值为null，那么就会抛出空指针异常了。
		 */
		Integer old = map.put("化学", 55);	
		System.out.println(map);
		System.out.println("old:"+old);
		
		/*
		 * 获取元素个数(一组键值对算一个元素)
		 */
		int size = map.size();
		System.out.println("size:"+size);
		
		
		/*
		 * V get(Object k)
		 * 根据给定的key获取对应的value
		 * 若给定的key在Map中不存在，则返回值为null。
		 */
		Integer value = map.get("语文");
		System.out.println("value:"+value);
		
		value = map.get("体育");
		System.out.println("value:"+value);
		
		
		/*
		 * V remove(K k)
		 * 根据给定的key删除对应的这一组键值对，返回值
		 * 为该key所对应的value
		 */
		old = map.remove("语文");
		System.out.println(map);
		System.out.println("old:"+old);
	}
}










