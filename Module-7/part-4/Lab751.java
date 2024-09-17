import java.util.*;
class Lab751{ 
public static void main(String args[]) { 
Map<String,String> mymap = new HashMap<>(); 
mymap.put("sid","101"); 
mymap.put("sname","sri"); 
mymap.put("phone","12345"); 
mymap.put("email","sri@myjlc"); 
mymap.put("city","Blore"); 
System.out.println(mymap); 
System.out.println(mymap.remove("sid")); 
System.out.println(mymap.remove("phone"));
System.out.println(mymap); 
System.out.println(mymap.get("city")); 
System.out.println(mymap.remove("mycity")); 
mymap.put("phone","12345");
mymap.replace("phone","0022");
System.out.println(mymap);
mymap.clear();
System.out.println(mymap);
}
} 
