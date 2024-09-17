import java.util.*; 
class Lab748{ 
public static void main(String args[]) { 

PriorityQueue<Integer> pque = new PriorityQueue<>(Collections.reverseOrder()); 

pque.offer(10); 
pque.offer(30);  
pque.offer(40);  
pque.offer(50); 
pque.offer(79);
pque.offer(76);
pque.offer(43);
 
System.out.println(pque); 
System.out.println(pque.peek()); 
pque.poll(); 

System.out.println(pque); 
System.out.println(pque.peek()); 
pque.poll(); 

System.out.println(pque); 
System.out.println(pque.peek()); 
pque.poll(); 

} 
}