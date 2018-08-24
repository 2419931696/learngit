package map;

import java.util.HashMap;
import java.util.Map;

/**
 * 统计字符串中各字符出现的个数,并输出结果
 * @author adminitartor
 *
 */
public class Test {
	public static void main(String[] args) {
		String str = "helloworld,thinking in java!";
		/*
		 * 思路:
		 * 用Map保存统计结果
		 * key:出现的字符
		 * value:对应字符出现的次数
		 * 
		 * 遍历字符串中每个字符，当该字符在Map中不存在时
		 * 说明该字符是第一次出现，将字符作为key，value为
		 * 1存入Map中。
		 * 若存在，说明该字符统计过，只需要将对应的value
		 * 取出，并+1再存入。
		 */
		Map<Character, Integer> map 
			= new HashMap<Character,Integer>();	
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else{
				map.put(c, 1);
			}
		}		
		System.out.println(map);
	}
}






