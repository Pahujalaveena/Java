package Java_Tutorial;
import java.util.*;
public class ConditionalElseIf {

	public static void main(String[] args) {

		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Check whether a number is positive, negative or zero ");
		System.out.println("Enter a number:");
		
		a=sc.nextInt();
		if(a>0)
		{
			System.out.println("The number is positive");
		}
		else if(a<0)
		{
			System.out.println("The number is negative");
		}
		else
		{
			System.out.println("The number is zero");
		}
		
		
		sc.close();
	}

}
