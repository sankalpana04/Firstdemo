package HelloWorld;

public class Calculate {
	
	void sum(int x,int y) {
		
		System.out.println(x+y);		
	}
	 void sum(int x, int y, int z) {
		 
		 System.out.println(x+y+z);
		 
	 }
	 
	 void sum(double x, double y) {
		 System.out.println(x+y);
	 }
	 
	 void sum(double x, double y,double z) {
		 System.out.println(x+y+z);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculate cal = new Calculate();
		cal.sum(10, 20);
		cal.sum(30, 40, 50);
		cal.sum(20, 40);
		cal.sum(90, 100, 200);
		
		
  
	}

}
