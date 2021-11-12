package HelloWorld;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		HashMap <Integer,String> hm=new HashMap<Integer,String>();
		//Adding key pairs into hash map
		hm.put(100,"raj");
		hm.put(200,"rahul");
		hm.put(300,"kiram");
		System.out.println(hm);
		for(Map.Entry m:hm.entrySet())
		{
		System.out.println(m.getKey()+" "+m.getValue());
		}
		hm.remove(300);
		System.out.println(hm);
		}
		}