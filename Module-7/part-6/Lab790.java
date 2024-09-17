
import java.util.*;



public class Lab790 {
	public static void main(String[] args) {
		List<Integer> mylist = new ArrayList<>();
		mylist.add(78);
		mylist.add(95);
		mylist.add(33);
		mylist.add(23);
		mylist.add(100);
		mylist.add(122);
		mylist.add(90);
		
		List<Integer> mylist2 = new ArrayList<>();
		mylist2.add(23);
		mylist2.add(45);
		mylist2.add(15);
		
		System.out.println("mylist: "+mylist);
		System.out.println("mylist2: "+mylist2);
		
		Collections.copy(mylist, mylist2);
		System.out.println("mylist: "+mylist);
		System.out.println("mylist2: "+mylist2);
		
		mylist2.add(43);
		mylist2.add(87);
		mylist2.add(34);
		
		Collections.copy(mylist, mylist2);
		System.out.println("mylist: "+mylist);
		System.out.println("mylist2: "+mylist2);
		
		
		
		
	}

}
