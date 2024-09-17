import java.util.*; 
class Lab767{ 
public static void main(String args[]) { 
List<String> mylist1 = new ArrayList<>(); 
mylist1.add("Java"); 
mylist1.add("Spring"); 
mylist1.add("DSA"); 

System.out.println("String Elements"); 

for(String str : mylist1){ 
System.out.println(str); 
//10 Lines of Code for Processing 
} 
List<Integer> mylist2 = new ArrayList<>(); 
mylist2.add(10); 
mylist2.add(20); 
mylist2.add(30); 
System.out.println("Integer Elements"); 
for(Integer x : mylist2){ 
System.out.println(x); 
//10 Lines of Code for Processing 
} 
List<Double> mylist3 = new ArrayList<>(); 
mylist3.add(66.6); 
mylist3.add(77.7); 
mylist3.add(88.8); 
System.out.println("Double Elements"); 
for(Double d : mylist3){ 
System.out.println(d); 
//10 Lines of Code for Processing 
} 
} 
}