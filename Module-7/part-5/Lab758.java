
import java.util.*; 
class Lab758{ 
public static void main(String args[]) { 
List<Integer> mylist = new ArrayList<Integer>(); 
//List<Integer> mylist = new LinkedList<Integer>(); 
mylist.add(10); 
mylist.add(20); 
mylist.add(30); 
//mylist.add(99.99); 
//mylist.add("sri"); 
System.out.println(mylist); 
System.out.println("Using for"); 
for(Integer x:mylist){ 
System.out.println(x); 
} 
System.out.println("Using Iterator"); 
Iterator<Integer> it = mylist.iterator(); 
while(it.hasNext()){ 
Integer x = it.next(); 
System.out.println(x); 
} 
} 
} 