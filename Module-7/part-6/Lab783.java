import java.util.*;

class SBCompartor implements Comparator <StringBuilder>{

	

	@Override
	public int compare(StringBuilder sb1, StringBuilder sb2) {
	
		String str1 = sb1.toString();
		String str2 = sb2.toString();
		int x =str1.compareTo(str2);
		return x;
	}

	
	
}
public class Lab783 {
	public static void main(String[] args) {
		//Set <String> myset = new TreeSet<>();
		// compareTo();
		
		Set<StringBuilder> myset1 = new TreeSet<>(new SBCompartor());
		// compare();
		
		
		myset1.add(new StringBuilder("hello"));
		myset1.add(new StringBuilder("react"));
		myset1.add(new StringBuilder("spring"));
		myset1.add(new StringBuilder("java"));
		myset1.add(new StringBuilder("dsa"));
		
		System.out.println(myset1);
		
		@SuppressWarnings("unchecked")
		Set<StringBuilder> myset2 = new TreeSet<>(new SBCompartor().reversed());
		// compare();
		
		myset2.add(new StringBuilder("hello"));
		myset2.add(new StringBuilder("react"));
		myset2.add(new StringBuilder("spring"));
		myset2.add(new StringBuilder("java"));
		myset2.add(new StringBuilder("dsa"));
		
		
		System.out.println(myset2);
		
		

	}

}
