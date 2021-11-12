package HelloWorld;

public class Calculation {

	int a;
	int b;
	int c;


 Calculation(int a1,int b1, int c1){
	 a=a1;
	 b=b1;
	 c=c1;
 }
 
 public void sum() {
	  
		 int total = a+b+c;
		 System.out.println("the sum of 3 variables is:"+total);
	 }
  
  public static void main(String[] args) {
	  Calculation c1 = new Calculation(30,40,60);
	  c1.sum();
  }
}
  
