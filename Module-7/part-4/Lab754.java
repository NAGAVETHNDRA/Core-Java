import java.util.*;
class Lab754{ 
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

System.out.println("print keys");

Set<Map.Entry<String,String>> mykey =  mymap.entrySet();
for(Map.Entry<String,String> myk : mykey){
//System.out.println(myk);
String myk1 = myk.getKey();
String myval = myk.getValue();
System.out.println(myk1 + "\t : \t"+myval);
}




}
} 
