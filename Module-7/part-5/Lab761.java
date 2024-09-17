import java.util.*; 
class Lab761{ 
public static void main(String args[]) { 
Set<Integer> myset = new HashSet<Integer>(); 
//Set<Integer> myset = new LinkedHashSet<Integer>(); 
//Set<Integer> myset = new TreeSet<Integer>(); 
myset.add(20); 
myset.add(60); 
myset.add(10); 
myset.add(30); 
//myset.add(99.99); 
//myset.add("sri"); 
System.out.println(myset); 
System.out.println("Using for"); 
for(Integer x:myset){ 
System.out.println(x); 
} 
System.out.println("Using Iterator"); 
Iterator<Integer> it = myset.iterator(); 
while(it.hasNext()){ 
Integer x = it.next(); 
System.out.println(x); 
}
}
}