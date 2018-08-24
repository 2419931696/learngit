package socket;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		int[] allOut = {2,5,6,8,7,9,4,1,3};
		System.out.println(Arrays.toString(allOut));
		int pw = 4;
		//将4从数组中删除
		
		for(int i=0;i<allOut.length;i++){
			if(allOut[i]==pw){
				//将最后一个元素设置到该位置
				allOut[i] = allOut[allOut.length-1];
				allOut = Arrays.copyOf(allOut, allOut.length-1);
				break;
			}
		}
		
		
		System.out.println(Arrays.toString(allOut));
	}
}




