package Day_3;
import java.util.*;
public class Day38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> l1=new ArrayList<Integer>();
        l1.add(12);
        l1.add(45);
        l1.add(78);
        System.out.println(l1);
        Iterator i1=l1.iterator();
        while(i1.hasNext()) {
        	System.out.println(i1.next());
        }
	}

}
