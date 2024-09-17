import java.util.*; 
class Lab747{ 
public static void main(String args[]) { 

PriorityQueue<Integer> myque = new PriorityQueue<>(Collections.reverseOrder()); 

myque.offer(50); 
myque.offer(80); 
System.out.println(myque); 

myque.offer(20);
System.out.println(myque);  
myque.offer(30); 
System.out.println(myque); 
myque.offer(70); 

System.out.println(myque); 

} 
}