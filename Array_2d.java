package Basic;

public class Array_2d {

	public static void main(String args[]) {
		
		int[][] arr= {{2,3,4},{5,6,7},{3,4,2}};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
