package Java_Tutorial;

public class LoopDoWhile {
	
	public static void main(String[] args) {

		int n=9;
		System.out.println("The table of "+n+" is ");
		
		int i=1;
		do
		{
			System.out.println(n+" * "+" i "+" = "+n*i);
			i++;
		}
		while(i<=10);
	}

}
