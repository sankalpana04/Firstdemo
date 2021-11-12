package HelloWorld;

import java.util.Scanner;

public class Countdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int num;
		Scanner sc1 = new Scanner(System.in);
       System.out.println("enter the value of num");
       num =sc1.nextInt();
       
      while(num!=0) {
    	  num = num/10;
    	  ++count;
    	  
    	  
      }
	  System.out.println("the number of digits is:" +count);

    
	}

}
