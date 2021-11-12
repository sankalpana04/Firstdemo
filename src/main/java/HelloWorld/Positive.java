package HelloWorld;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a");
		a = sc.nextInt();
		if(a>0) {
			System.out.println("the number "+a+" is positive");
			
		}
		else if(a<0) {
			System.out.println("the number "+a+" is negative");
		}

	}

}
