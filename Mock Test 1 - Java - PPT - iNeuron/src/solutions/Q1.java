package solutions;

import java.util.Scanner;

public class Q1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number::");
		int num = sc.nextInt();
		if (num>0) {
			System.out.println("Number Entered Is Positive");
		} else if (num<0){
			System.out.println("Number Entered Is Negative ");
		}
		else
		{
			System.out.println("Number Entered Is Zero ");
		}
	}

}
