package Day_4;

import java.util.*;

public class Collect10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map<Integer,String> m1=new HashMap<Integer,String>();
        m1.put(1,"cse");
        m1.put(1,"ese");
        m1.put(1,"eee");
        m1.put(1,"civil");
        m1.put(1,"dse");
        m1.put(1,"aiml");
        System.out.println(m1);
        for(Map.Entry<Integer,String> i:m1.entrySet()) {
        	System.out.println(i.getValue());
        	System.out.println(i.getKey());
        	
        }
	}
}
