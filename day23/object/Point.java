package object;
/**
 * java中所有的类都继承自Object。当一个类没有显示的继承
 * 某个类默认就继承自Object.
 * @author adminitartor
 *
 */
public class Point {
	private int x;
	private int y;	
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * 当我们用到一个类(自己定义的类)的toString方法时
	 * 就应当重写这个方法。返回的字符串没有严格要求内容
	 * 可根据将来实际开发需求而定，但是原则上返回的字符串
	 * 中应当包含当前对象的属性信息。
	 */
	public String toString(){
		// (1,2)
		return "("+x+","+y+")";
	}
	
	/**
	 * Object定义的equals方法的意图是比较两个对象的
	 * 内容是否相同。但是Object本身提供的equals内部
	 * 就是用"=="比较的，并无实际意义，所以若希望比较
	 * 内容就应当重写该方法。java提供的类基本都已经重写
	 * 过了。只有我们自定义的类需要单独重写。
	 */
	public boolean equals(Object o){
		if(o == null){
			return false;
		}
		if(o == this){
			return true;
		}
		if(o instanceof Point){
			Point point = (Point)o;
			return this.x==point.x&&this.y==point.y;
		}
		
		return false;
	}
	
}











