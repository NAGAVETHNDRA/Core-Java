import java.util.*; 
class Lab792{ 
public static void main(String args[]) { 
List<Integer> mylist = new ArrayList<>(); 
mylist.add(10); 
mylist.add(20); 
mylist.add(30); 
System.out.println(mylist); 
List<Integer> unmodList = 
Collections.unmodifiableList(mylist); 
System.out.println(unmodList); 
mylist.add(50); 
System.out.println(mylist); 
unmodList.add(50); 
System.out.println(mylist); 
} 
} 