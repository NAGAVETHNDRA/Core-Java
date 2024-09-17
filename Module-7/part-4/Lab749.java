import java.util.*; 
class Lab749{ 
public static void main(String args[]) { 
Map mymap = new HashMap(); 

System.out.println(mymap); 
System.out.println(mymap.size()); 
System.out.println(mymap.isEmpty()); 

mymap.put("sid",101); 
mymap.put("name","sri"); 
mymap.put("sid",109); 
mymap.put("email","sri"); 
mymap.put("phone",109); 
mymap.put("email","sri@myjlc"); 
mymap.put(null,null); 
System.out.println(mymap);

System.out.println(mymap); 
System.out.println(mymap.size()); 
System.out.println(mymap.isEmpty()); 


 
} 
} 