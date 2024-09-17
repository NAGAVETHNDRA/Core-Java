import java.util.*; 
class Lab740{ 
public static void main(String args[]) { 
//Deque<Integer> myque = new ArrayDeque<>(); 
LinkedList<Integer> myque = new LinkedList<>(); 
System.out.println(myque.size()); 
System.out.println(myque.isEmpty()); 
System.out.println(myque); 
myque.offer(10); 
myque.offer(20); 
myque.offer(30); 
myque.offer(40); 
myque.offer(50); 
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