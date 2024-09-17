import java.util.*; 
class Lab742{ 
public static void main(String args[]) { 
//Deque<Integer> myque = new ArrayDeque<>(); 
LinkedList<Integer> myque = new LinkedList<>(); 

myque.add(10); 
myque.add(20); 
myque.add(30); 
myque.add(40); 
myque.add(50); 
System.out.println(myque); 

System.out.println("forword order");

Iterator <Integer> myit = myque.iterator();
while(myit.hasNext()){
Integer x = myit.next();
System.out.println(x);
}

System.out.println("reverse order");

Iterator <Integer> myit1 = myque.descendingIterator();
while(myit1.hasNext()){
Integer x = myit1.next();
System.out.println(x);
}



} 
}