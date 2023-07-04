package solutions;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		System.out.println("Enter The Number::");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1=0;
		int num2=1;
		int num3=num1+num2;
		System.out.println(0);
		System.out.println(1);
		for (int i = num3; num3<num; ++i) {
			
			num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;	
		}
	}

}
