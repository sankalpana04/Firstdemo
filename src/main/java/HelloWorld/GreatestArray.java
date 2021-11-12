package HelloWorld;

public class GreatestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		int min=a[0];

		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
			  max=a[i];
			}
		
		}

	System.out.println("Max elemenent of an array is:"+max);


	for(int i=0;i>a.length;i++) {
		if(a[i]<min) {
			min=a[i];
		}
	}
	System.out.println("min element of an array is:"+min);
}
}
