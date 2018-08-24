package integer;
/**
 * JDK1.5之后推出了一个新的特性:自动拆装箱
 * 该特性是编译器认可的，会在编译期间自动将基本类型与对应
 * 的包装类互相转换，省去我们转换的麻烦。
 * @author adminitartor
 *
 */
public class IntegerDemo2 {
	public static void main(String[] args) {
		/*
		 * 触发了自动装箱特性，编译器会将基本类型补全
		 * 代码转换为对应的包装类:
		 * Integer i = Integer.valueOf(1);
		 */
		Integer i = 1;
		/*
		 * 触发了自动拆箱特性，编译器会将包装类补全代码
		 * 转换为对应的基本类型:
		 * int d = i.intValue();
		 */
		int d = i;
		
		Object object = 1;
	}
}
