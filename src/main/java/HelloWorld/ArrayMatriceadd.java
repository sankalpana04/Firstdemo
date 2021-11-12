package HelloWorld;

public class ArrayMatriceadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3},{4,4,5},{7,8,8}};
		int b[][]= {{2,3,4},{5,6,7},{8,9,10}};
		int c[][]= new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j] = a[i][j]+b[i][j];
			
			
			System.out.println(c[i][j]+" ");

		}
		
		 System.out.println();

	}
   
}
}f

