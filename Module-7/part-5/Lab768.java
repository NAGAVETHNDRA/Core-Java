import java.util.*; 
class Lab768{ 
public static void Show (List<Object> mylist){
for (Object obj : mylist){
System.out.println(obj);
}
}

public static void main(String args[]) { 
List<String> mylist1 = new ArrayList<>();
 
mylist1.add("Java"); 
mylist1.add("Spring"); 
mylist1.add("DSA"); 

System.out.println("String Elements"); 
Show(mylist1);

List<Integer> mylist2 = new ArrayList<>();
 
mylist2.add(10); 
mylist2.add(20); 
mylist2.add(30); 
System.out.println("Integer Elements"); 

List<Double> mylist3 = new ArrayList<>(); 
mylist3.add(66.6); 
mylist3.add(77.7); 
mylist3.add(88.8); 
System.out.println("Double Elements"); 

} 
}