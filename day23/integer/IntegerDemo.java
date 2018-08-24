package integer;
/**
 * java有8个基本类型，但是它们不具备面向对象的特性，所以
 * 不能直接参与面向对象开发,那么在实际使用上会出现很多的
 * 不便，为此java为8个基本类型提供了对应的包装类，以便于
 * 让基本类型以对象形式存在并参与面向对象的开发中
 * @author adminitartor
 *
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//可以通过实例化将基本类型转换为对应的包装类
//		Integer i1 = new Integer(1);
//		Integer i2 = new Integer(1);
		
		//推荐使用静态方法valueOf将基本类型转为包装类
		Integer i1 = Integer.valueOf(128);
		Integer i2 = Integer.valueOf(128);
		
		System.out.println(i1==i2);//true
		System.out.println(i1.equals(i2));//true
		
		/*
		 * 数字类型的包装类提供了一组方法:
		 * intValue,doubleValue,floatValue等等
		 * 可以将当前包装类表示的数字转换为对应的基本
		 * 类型。
		 */
		int d = i1.intValue();
		System.out.println(d);
		
		double dou = i1.doubleValue();
		System.out.println(dou);
		
		byte b = i1.byteValue();
		System.out.println(b);
		
		
		//获取int最大值?
		int imax = Integer.MAX_VALUE;
		System.out.println(imax);
		int imin = Integer.MIN_VALUE;
		System.out.println(imin);
	
		long lmax = Long.MAX_VALUE;
		System.out.println(lmax);
	}
}









