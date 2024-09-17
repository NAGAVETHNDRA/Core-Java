import java.util.*; 
class Lab739{ 
public static void main(String args[]) { 
//Deque<Integer> myque = new ArrayDeque<>(); 
LinkedList<Integer> myque = new LinkedList<>(); 
System.out.println(myque.size()); 
System.out.println(myque.isEmpty()); 
System.out.println(myque); 
myque.add(10); 
myque.add(20); 
myque.add(30); 
myque.add(40); 
myque.add(50); 
System.out.println(myque.size()); 
System.out.println(myque.isEmpty()); 
System.out.println(myque); 
System.out.println("---------------"); 
System.out.println(myque.peek()); 
System.out.println(myque.pop()); 
System.out.println(myque); 
System.out.println("---------------"); 
System.out.println(myque.peek()); 
System.out.println(myque.pop()); 
System.out.println(myque); 
System.out.println("---------------"); 
System.out.println(myque.peek()); 
myque.push(60); 
System.out.println(myque); 
} 
}