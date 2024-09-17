
import java.util.*;



public class Lab789 {
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
	
	    
	    Collections.rotate(mylist,3);
	    System.out.println(mylist);


	    Collections.rotate(mylist,-2);
	    System.out.println(mylist);
		
	
		Collections.shuffle(mylist);
		System.out.println(mylist);
		
		for(int i =0;i<=3;i++){
		Collections.shuffle(mylist);
		System.out.println(mylist);

		
		}

		Collections.fill(mylist,1);
		System.out.println(mylist);

		
		
	}

}
