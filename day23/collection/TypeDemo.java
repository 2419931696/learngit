package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 泛型
 * 泛型是JDK1.5之后推出的另一个特性，泛型也称为参数化
 * 类型，指在使用某个类时为其属性，方法参数，方法返回值
 * 的类型指定实际类型。这在实际开发中可以大大提高代码的
 * 灵活度。
 * 泛型应用最广的地方就是集合，用来约束集合的元素类型。
 * 泛型的实际类型为Object，当不指定泛型时，默认就使用
 * 原型Object。
 * @author adminitartor
 *
 */
public class TypeDemo {
	public static void main(String[] args) {
		//创建集合时通过泛型约束集合的元素类型
		Collection<String> c = new ArrayList<String>();
		c.add("one");//此时集合只能存放String
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		//获取迭代器时也通过泛型告知迭代器元素类型
		Iterator<String> it = c.iterator();
		while(it.hasNext()){
			//获取元素时无需再造型
			String str = it.next();
			System.out.println(str);
		}
		//新循环也可以直接使用String接收集合元素了
		for(String str:c){
			System.out.println(str);
		}
		
	}
}








