package HelloWorld;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int temp;

		System.out.println("Before Swap:");
		System.out.println("a is :" + a);
		System.out.println("b is :" + b);

		// Usign temporary variable
		// temp=a;
		// a=b;
		// b=temp;

		// without using temporary varaible
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swap:");
		System.out.println("a is :" + a);
		System.out.println("b is :" + b);


	}

}
