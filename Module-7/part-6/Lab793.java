import java.util.*; 
class Lab793{ 
public static void main(String args[]) { 
List<Integer> mylist = new ArrayList<>(); 
mylist.add(10); 
mylist.add(20); 
mylist.add(30); 
System.out.println(mylist); 
List<Integer>sync = Collections.synchronizedList(mylist); 
System.out.println(sync); 
List<Integer> singletonList1 = Collections.singletonList(99);

System.out.println(singletonList1); 

List<String> singletonList2 = Collections.singletonList("jlc");

System.out.println(singletonList2); 
} 
} 