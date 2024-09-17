import java.util.*; 
class Lab763{ 
public static void main(String args[]) { 
//Map<String,Integer> mymap = new HashMap<>(); 
//Map<String,Integer> mymap = new LinkedHashMap<>(); 
Map<String,Integer> mymap = new TreeMap<>(); 
mymap.put("sri",90); mymap.put("vas",70); 
mymap.put("abc",99); mymap.put("ds",80);

 
System.out.println(mymap);
 
Set<String> mykeys = mymap.keySet(); 

System.out.println("Using for"); 

for(String key:mykeys){ 
System.out.println(key); 
} 
} 
} 