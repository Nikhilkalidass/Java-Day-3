package Session3;

import java.util.Arrays;

public class Arraymethod {
	public static void main(String[] args) {
		int[] num = { 10, 20, 30, 40, 50 };
		System.out.println("Length of num:" + num.length);

		int[] source= {1,2,3,4,5};
		int[] destination=new int[5];
		
		System.arraycopy(source, 0, destination, 0, source.length);
		for(int i:destination) {
			System.out.print(i+" ");
		}
		
		
		int[] b= {12,8,6,45,2};
		Arrays.sort(b);
		Arrays.fill(b, 2);
		Arrays.fill(b , 1,4,3);
		System.out.println(Arrays.toString(b));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
