package collection;
/**
 * 泛型
 * 泛型可以允许调用者在使用时决定一个类中属性，参数，返回
 * 值等的类型，从而提高代码的灵活性
 * @author adminitartor
 *
 */
public class Type<T> {
	private T x;
	private T y;
	
	public Type(T x, T y) {
		super();
		this.x = x;
		this.y = y;
	}
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
}







