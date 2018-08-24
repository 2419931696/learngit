package queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈结构
 * 栈也可以存放一组元素，但是存取元素必须遵循:先进后出原则
 * 
 * 双端队列如果只从同一端做进出队操作时，就实现了栈操作。
 * 为此双端队列Deque为栈提供了对应的方法
 * 入栈操作:push
 * 出栈操作:pop
 * @author adminitartor
 *
 */
public class StackDemo {
	public static void main(String[] args) {
		Deque<String> stack = new LinkedList<String>();
		//入栈操作
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		
		System.out.println(stack);
		//出栈操作
		String str = stack.pop();
		System.out.println(str);
		System.out.println(stack);
	}
}









