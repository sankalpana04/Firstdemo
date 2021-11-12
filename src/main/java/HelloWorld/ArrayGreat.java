package HelloWorld;


import java.util.Scanner;

public class ArrayGreat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n = s.nextInt();
		int a[] = new int[10];
		System.out.println("enter the elements of an array");
		for(int i=0;i<n;i++) {
			
			a[i]=s.nextInt();
			
		}
		       for(int i=0;i<n;i++)
		       {
					System.out.println("element of an array is:"+a[i]);
					
				}
				
		
		
	
			}
}
	
	
	
	
