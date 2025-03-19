package Session3;

import java.util.Scanner;

public class Netsedforloop {
	public static void main(String[] args) {
		int i;
		int j;
		int k;
/*	//Square pattern printing
for(i=1;i<5;i++) {
	for(j=1;j<i+1;j++)
	{
		System.out.print(j+" ");
	}
		System.out.println();
}*/

/* Triangle pattern
for(i=1;i<5;i++) {
	for(j=1;j<i+1;j++)
	{
		System.out.print(j+" ");
	}
		System.out.println();
}
}*/
		/*int num=6;
		for ( i=0;i<=num;i++) {
			for(j=1;j<i+1;j--) {
			//for(j=1;j<=num-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		//Diamond pattern
		Scanner n3=new Scanner(System.in);
		//No.of rows by user to give for pattern printing
		System.out.println("Enter no.of rows");
		int rows=n3.nextInt();
		//Top half
		for(i=1;i<=rows;i++) {
			//leading spaces
			for(j=i;j<rows;j++){
				System.out.print(" ");
			}
			//print *
			for(k=1;k<=(2*i-1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//Second half
				for(i=rows-1;i>=1;i--) {
					//leading spaces
					for(j=rows;j>i;j--){
						System.out.print(" ");
					}
					//print *
					for(k=1;k<=(2*i-1);k++) {
						System.out.print("*");
					}
					System.out.println();
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}