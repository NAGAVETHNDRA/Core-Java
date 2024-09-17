import java.util.*; 
class Lab743{ 
public static void main(String args[]) { 
//Deque<Integer> myque = new ArrayDeque<>(); 
LinkedList<Integer> myque = new LinkedList<>(); 

myque.add(10); 
myque.add(20); 
myque.add(30); 
myque.add(40); 
myque.add(50); 

System.out.println(myque); 

myque.addFirst(88);
myque.addLast(77);
System.out.println("---------------"); 
System.out.println(myque.getFirst()); 
System.out.println(myque.getLast()); 
System.out.println(myque); 
System.out.println("---------------"); 
System.out.println(myque.removeFirst()); 
System.out.println(myque.removeLast()); 
System.out.println(myque); 
System.out.println("---------------"); 
System.out.println(myque.getFirst());
System.out.println(myque.getLast()); 
System.out.println(myque); 
} 
}