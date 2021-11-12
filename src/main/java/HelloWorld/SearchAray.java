package HelloWorld;

public class SearchAray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = {"joe","drake"};
		String ele = "joe";
		boolean flag = false;
		for(String i : a) {
			if(ele == i) {
				flag=true;
				System.out.println("element is found");
				break;
			}
		}
		

	}

}
