import java.util.*;
class Lab757{ 
public static void main(String args[]) { 
Hashtable<String,String> mymap = new Hashtable<>(); 
mymap.put("sid","101"); 
mymap.put("sname","sri"); 
mymap.put("phone","12345"); 
mymap.put("email","sri@myjlc"); 
mymap.put("city","Blore"); 
System.out.println(mymap); 
Map<String,String>mymap1= new HashMap<>();
mymap1.put("Phone","888");
//mymap1.put("pincode",null);
//mymap1.put(null,null);

System.out.println(mymap1);

mymap.putAll(mymap1);
System.out.println(mymap);

System.out.println("print keys");

Set<String> mykey = mymap.keySet();

for(String myk : mykey){
System.out.println(myk);
}

}
} 
