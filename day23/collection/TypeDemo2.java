package collection;
/**
 * 泛型应用
 * @author adminitartor
 *
 */
public class TypeDemo2 {
	public static void main(String[] args) {
		/*
		 * Type中的x,y都是泛型<T>，而泛型的实际类型是
		 * Object，所以x,y实际上就是Object类型
		 *
		 * 在使用时,指定T为Integer,那么编译器会依靠该类型
		 * 检查对x,y赋值时的实际值的类型是否符合要求。
		 * 并且在获取它们的值时，编译器会自动添加造型代码
		 */
		Type<Integer> t = new Type<Integer>(1,2);
		//编译器会检查实参是否满足泛型所指定类型的要求
		t.setX(2);
		//获取时，无需造型(编译器会自动补全)
		int x = t.getX();
		System.out.println("x:"+x);
		System.out.println(t);
		
		Type<Double> t2 = new Type<Double>(1.1,2.2);
		t2.setX(2.2);
		double x2 = t2.getX();
		System.out.println("x2:"+x2);
		System.out.println(t2);
		
		Type<String> t3 = new Type<String>("一","二");
		t3.setX("三");
		String x3 = t3.getX();
		System.out.println("x3:"+x3);
		System.out.println(t3);
	}
}









