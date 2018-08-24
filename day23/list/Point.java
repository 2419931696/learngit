package list;
/**
 * 作为集合元素测试集合相关操作
 * 
 * @author adminitartor
 *
 */
public class Point implements Comparable<Point>{
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
	
	public String toString(){
		// (1,2)
		return "("+x+","+y+")";
	}
	
	
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

	/**
	 * 当一个类实现了Comparable接口后，要求必须实现
	 * compareTo方法。该方法的作用是定义当前对象this
	 * 与参数对象o之间的大小关系。
	 * 
	 * 返回值是一个int值，该值不关心具体取值，只关注
	 * 取值范围。
	 * 当:
	 * 返回值>0时:当前对象大于参数对象(this>o)
	 * 返回值<0时:当前对象小于参数对象(this<o)
	 * 返回值=0时:两个对象相等
	 */
	public int compareTo(Point o) {
		/*
		 * 俩个点比较大小的方式:点到原点的距离长的大
		 */
		int len = this.x*this.x+this.y*this.y;
		int olen = o.x*o.x+o.y*o.y;
		return len-olen;
	}
	
}











