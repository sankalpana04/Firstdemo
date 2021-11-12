package HelloWorld;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of characteres");
		String reve = sc.nextLine();
		StringBuffer str = new StringBuffer(reve);
	     str.reverse();
		System.out.println("reverse of the string is:" +str);
			
			
		}
		
		

	}


