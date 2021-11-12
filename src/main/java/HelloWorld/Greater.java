package HelloWorld;

import java.util.Scanner;

public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of a");
		a=sc.nextInt();
		System.out.println("enter the value of b");
		b=sc.nextInt();
		System.out.println("enter the value of c");
		c= sc.nextInt();
		if(a>b && a>c) {
			System.out.println("Largest number is:"+a);
		}
			
		else if(b>c) {
			System.out.println("Largest number is:"+b);
		}
		else
		{
			System.out.println("Largest number is:"+c);
		}
	}

}
