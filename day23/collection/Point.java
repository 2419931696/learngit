package collection;
/**
 * 作为集合元素测试集合相关操作
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
	
}











