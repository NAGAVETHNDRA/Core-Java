
import java.util.*;

class StringCompartor implements Comparator<String> {
	public int compare(String str1,String str2) {
		int x = str1.compareTo(str2);
		return x;
				
	}
	
}

public class Lab785 {
	public static void main(String[] args) {
		List<String> mylist = new ArrayList<>();
		mylist.add("hello");
		mylist.add("angular");
		mylist.add("java");
		mylist.add("react");
		mylist.add("dsa");
		System.out.println(mylist);
		//Collections.sort(mylist);
		//System.out.println(mylist);
		
		Collections.sort(mylist, new StringCompartor());
		System.out.println(mylist);
		
		Collections.sort(mylist, new StringCompartor().reversed());
		System.out.println(mylist);
		
		
	}

}
