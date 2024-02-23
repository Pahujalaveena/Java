package Java_Tutorial;
import java.util.*;
public class Functions {
	
	public static void printMyName(String name)
	{
		System.out.println("Hello, "+name);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		printMyName(name);
	}

}
