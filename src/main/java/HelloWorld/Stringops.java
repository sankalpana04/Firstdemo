package HelloWorld;

public class Stringops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Sparkplug";
		String s2 = "sparkplugin";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.compareTo(s2));
		//concat System.out.println(s2.concat(s1));
		//length System.out.println(s1.length());
		System.out.println(s1.substring(1,3));
		System.out.println(s2.toUpperCase());
		System.out.println(s1.toLowerCase());
 	}

}
