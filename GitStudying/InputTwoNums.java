package modulization;

import java.util.Scanner;

public class InputTwoNums {

	static int num1, num2;
	
	public static void main(String[] args) {
		System.out.print("Input Two Nums : ");
		Scanner scan = new Scanner(System.in);
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		System.out.printf("Print Two Num : %d %d \n",num1,num2);
	}
}
