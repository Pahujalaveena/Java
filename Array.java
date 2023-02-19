package Basic;
import java.util.Scanner;
public class Array {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[6];
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<6;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		System.out.println("The elements of an array are");
		for(int i=0;i<6;i++) {
			System.out.println(" "+arr[i]);
		}
	}
}
