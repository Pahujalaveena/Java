package Java_Tutorial;
import java.util.*;
public class Sum {
	
	public static void main(String args[])
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		
		int sum = a + b;
		System.out.println("The sum of two numbers is "+sum);
		
		sc.close();
	}

}
