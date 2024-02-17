package Java_Tutorial;

import java.util.Scanner;

public class ConditionalIf {

	public static void main(String[] args) {

		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Check whether a number is even or odd");
		System.out.println("Enter a number");
		num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("The number is even");
		}
		if(num%2!=0)
		{
			System.out.println("The number is not ");
		}
		
		sc.close();
	}

}
