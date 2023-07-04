package solutions;

import java.util.Scanner;

public class Q4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 Numbers::");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if (num1>num2 && num1>num3) {
			System.out.println("Largest Number is::"+num1);}
		else if (num2>num1 && num2>num3) {
				System.out.println("Largest Number is::"+num2);}
		else if (num3>num1 && num3>num2) {
			System.out.println("Largest Number is::"+num3);}
		else if(num1==num2 && num2==num3) {
			System.out.println(num1+" & "+num2+" & "+num3+ " are equal");}		
		else if(num1==num2 && num1>num3) {
			System.out.println(num1+" & "+num2+ " are equal Largest Among Three");}
		else if(num1==num2 && num1<num3) {
			System.out.println(num1+" & "+num2+ " are equal "+num3 +" Largest Among Three");}
		else if(num1==num3 && num1>num2) {
			System.out.println(num1+" & "+num3+ " are equal Largest Among Three");}
		else if(num1==num3 && num1<num2) {
			System.out.println(num1+" & "+num3+ " are equal "+num2 +" Largest Among Three");}
		else if(num2==num3 && num2>num1) {
			System.out.println(num2+" & "+num3+ " are equal Largest Among Three");}
		else if(num2==num3 && num2<num1) {
			System.out.println(num2+" & "+num3+ " are equal "+num1 +"  Largest Among Three");}
		
	}

}
