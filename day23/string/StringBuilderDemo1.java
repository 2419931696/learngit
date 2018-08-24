package string;
/**
 * 字符串的设计关注的是字符串的重用，对于修改字符串而言，
 * 效率与资源消耗都比较大，为此字符串不适合频繁的修改。
 * 对此，java提供了一个专门用于修改字符串内容的类:
 * StringBuilder。其内部维护一个可变的char数组，所以修改
 * 都是建立在一个StringBuilder对象上完成，不会反复创建
 * 新对象。并且其还提供了便于修改字符串内容的相关方法，
 * 包括的操作有:增，删，改，插。
 * @author adminitartor
 *
 */
public class StringBuilderDemo1 {
	public static void main(String[] args) {
		//默认创建内部表示空字符串
//		StringBuilder builder = new StringBuilder();
		
		String string = "努力学习java";
		StringBuffer builder = new StringBuffer(string);
		
		/*
		 * append():向当前字符串末尾追加给定内容
		 */
		builder.append(",为了找个好工作!");
		
		//获取builder内部修改好的字符串
		string = builder.toString();
		System.out.println(string);
		
		
		/*
		 * replace():将当前字符串指定范围内的内容替换
		 * 为给定字符串(修改部分内容)
		 */
		//努力学习java,为了找个好工作!
		//努力学习java,就是为了改变世界!
		builder.replace(9, 16, "就是为了改变世界");
		System.out.println(builder.toString());
		
		/*
		 * delete():删除当前字符串部分内容
		 */
		//努力学习java,就是为了改变世界!
		//,就是为了改变世界!
		builder.delete(0, 8);
		System.out.println(builder.toString());
		
		
		/*
		 * insert():将指定内容插入到指定位置
		 */
		//,就是为了改变世界!
		//活着,就是为了改变世界!
		builder.insert(0, "活着");
		System.out.println(builder.toString());
	}
}








