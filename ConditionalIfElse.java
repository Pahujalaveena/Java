package Java_Tutorial;
import java.util.*;
public class ConditionalIfElse {
	
	public static void main(String args[])
	{
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("If else");
		System.out.println("Enter you age to check the voting eligibility");
		age=sc.nextInt();

		
		if(age>=18)
		{
			System.out.println("You are eligible to vote");
		}
		else
		{
			System.out.println("You are not eligible to vote");
		}
		
		sc.close();
	}

}
