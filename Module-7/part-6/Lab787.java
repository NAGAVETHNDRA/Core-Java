
import java.util.*;



public class Lab787 {
	public static void main(String[] args) {
		List<Integer> mylist = new ArrayList<>();
		mylist.add(78);
		mylist.add(95);
		mylist.add(33);
		mylist.add(23);
		mylist.add(100);
		System.out.println(mylist);
	    Collections.sort(mylist);
	    System.out.println(mylist);
		
	    int y = Collections.binarySearch(mylist, 95);
	    System.out.println(y);
	    
	    Collections.reverse(mylist);
	    System.out.println(mylist);
		
		
		
	}

}