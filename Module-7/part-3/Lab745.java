import java.util.*; 
class Lab745{ 
public static void main(String args[]) { 

PriorityQueue<Integer> myque = new PriorityQueue<>(); 

myque.offer(10); 
myque.offer(20); 
System.out.println(myque); 

myque.offer(30);
System.out.println(myque);  
myque.offer(40); 
System.out.println(myque); 
myque.offer(50); 

System.out.println(myque); 

} 
}