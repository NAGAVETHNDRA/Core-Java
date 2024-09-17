import java.util.Locale; 
class Lab810 { 
public static void main(String[] args) { 
Locale loc = Locale.getDefault(); 
System.out.println(loc); 
System.out.println(loc.getCountry()); // Code 
System.out.println(loc.getDisplayCountry()); 
System.out.println(loc.getLanguage()); // Code 
System.out.println(loc.getDisplayLanguage()); 
Locale myloc = new Locale("hi", "In"); 
System.out.println(myloc); 
System.out.println(myloc.getCountry()); 
System.out.println(myloc.getDisplayCountry()); 
System.out.println(myloc.getLanguage()); 
System.out.println(myloc.getDisplayLanguage()); 
} 
}