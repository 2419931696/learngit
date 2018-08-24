package collection;
/**
 * 泛型是编译器认可，而非虚拟机认可
 * @author adminitartor
 *
 */
public class TypeDemo3 {
	public static void main(String[] args) {
		Type<Integer> t1 = new Type<Integer>(1,2);
		//编译器会检查实参类型是否符合泛型要求
		t1.setX(3);
		//编译器会自动补充造型回Integer的代码
		int x1 = t1.getX();
		System.out.println("x1:"+x1);
		System.out.println("t1:"+t1);		
		//当不指定泛型时，编译器默认认为是原型Object
		Type t2 = t1;
		System.out.println("t2:"+t2);		
		t2.setX("一");
		System.out.println("t2:"+t2);		
		//类造型异常!
		x1 = t1.getX();
		System.out.println("x1:"+x1);
		System.out.println("t1:"+t1);
		
	}
}









