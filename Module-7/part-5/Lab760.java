
import java.util.*; 
class Lab760{ 
public static void main(String args[]) { 
ArrayList<Integer> mylist = new ArrayList<Integer>(); 
//List<Integer> mylist = new LinkedList<Integer>(); 
mylist.add(10); 
mylist.add(20); 
mylist.add(30); 
//mylist.add(99.99); 
//mylist.add("sri"); 

ArrayList<Integer> mylist2 = new ArrayList<>();
mylist2.add(15);
mylist2.add(25);
mylist2.add(35);

ArrayList<Integer> mylist3 = new ArrayList<>();
mylist3.add(16);
mylist3.add(26);
mylist3.add(37);

ArrayList<ArrayList<Integer>>  TotalList = new ArrayList<>();
TotalList.add(mylist);
TotalList.add(mylist2);
TotalList.add(mylist3);

System.out.println(TotalList); 
System.out.println("Using for"); 
for(List<Integer> x:TotalList){ 
System.out.println(x); 
} 
} 
} 