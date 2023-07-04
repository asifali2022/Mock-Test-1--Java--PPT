package solutions;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
	System.out.println("calculate average");
	System.out.print("Enter no.of numbers to calculate::");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int arr[]=new int[num];
	int j=0;
	for (int i : arr) {
		arr[j++]=sc.nextInt();
	}	

	int sum=0;
	int i=0;
	do {
		sum=sum+arr[i++];
	
		
	} while (i<num);
	System.out.println(sum);
	}

	
}
