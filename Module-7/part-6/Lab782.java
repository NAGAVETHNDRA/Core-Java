
import java.util.*;

class StringCompartor implements Comparator <String>{

	@Override
	public int compare(String str1, String str2) {
		int x = str1.compareTo(str2);
		//System.out.println(x);
		return x;
		
	}

	
	
}
public class Lab782 {
	public static void main(String[] args) {
		//Set <String> myset = new TreeSet<>();
		// compareTo();
		
		Set<String> myset1 = new TreeSet<>(new StringCompartor());
		// compare();
		
		myset1.add("hello");
		myset1.add("angular");
		myset1.add("spring");
		myset1.add("react");
		myset1.add("dsa");
		myset1.add("java");
		
		System.out.println(myset1);
		
		@SuppressWarnings("unchecked")
		Set<String> myset2 = new TreeSet<>(new StringCompartor().reversed());
		// compare();
		
		myset2.add("hello");
		myset2.add("angular");
		myset2.add("spring");
		myset2.add("react");
		myset2.add("dsa");
		myset2.add("java");
		
		System.out.println(myset2);
		
		

	}

}
