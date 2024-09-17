package newproblem;
import java.util.*;
public class Lab811 {
	public static void main(String[] args) {
		System.out.println("India Suported Languages");
		Locale loc[] = Locale.getAvailableLocales();
		for(int i = 0; i<loc.length;i++) {
			Locale myloc = loc[i];
			String country = myloc.getCountry();
			if(country.equals("IN"));{
				System.out.println(myloc.getDisplayLanguage()+"\t"+myloc.getDisplayCountry());
			}
		}
		System.out.println("------------------------------------------------------");
		
		
		System.out.println("India Suported Languages");
		Locale loc1[] = Locale.getAvailableLocales();
		for(int i = 0; i<loc1.length;i++) {
			Locale myloc1 = loc1[i];
			String country = myloc1.getCountry();
			if(country.equals("en"));{
				System.out.println(myloc1.getDisplayLanguage()+"\t"+myloc1.getDisplayCountry());
			}
		}
		
	}

}
