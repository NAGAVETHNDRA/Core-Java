import java.util.*;
class Lab752{ 
public static void main(String args[]) { 
Map<String,String> mymap = new HashMap<>(); 
mymap.put("sid","101"); 
mymap.put("sname","sri"); 
mymap.put("phone","12345"); 
mymap.put("email","sri@myjlc"); 
mymap.put("city","Blore"); 
System.out.println(mymap); 
Map<String,String>mymap1= new HashMap<>();
mymap1.put("Phone","888");
mymap1.put("pincode","521456");

System.out.println(mymap1);

mymap.putAll(mymap1);
System.out.println(mymap);
}
} 
