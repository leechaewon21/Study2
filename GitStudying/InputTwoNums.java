package modulization;

import java.util.Scanner;
import modulization.PlusFunction;

public class InputTwoNums {

	static int num1, num2;
	
	public static void main(String[] args) {
		System.out.print("Input Two Nums : ");
		Scanner scan = new Scanner(System.in);
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		System.out.printf("Print Two Nums : %d %d \n",num1,num2);
		
		int sum = PlusFunction.plusTwoNums(num1,num2);
		System.out.printf("Plus Two Nums : %d \n", sum);
	}
}
