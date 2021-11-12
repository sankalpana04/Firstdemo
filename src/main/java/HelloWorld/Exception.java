package HelloWorld;

public class Exception {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		try {
			System.out.println(a/0);
		}
		catch(ArithmeticException e) {
			System.out.println("entered into catch block");
		}
		finally {
			System.out.println("executed block of code");
		}
		
	}
}
