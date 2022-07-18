package modulization;

import java.util.Scanner;

import modulization.MinusFunction;

public class InputTwoNums {

	static int num1, num2;
	
	public static void main(String[] args) {
		System.out.print("Input Two Nums : ");
		Scanner scan = new Scanner(System.in);
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		System.out.printf("Print Two Nums : %d %d \n",num1,num2);
		
		int diff = MinusFunction.minusTwoNums(num1,num2);
		System.out.printf("Minus Two Nums : %d \n", diff);
	}
}
