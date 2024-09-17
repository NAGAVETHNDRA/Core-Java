import java.util.*; 
class Lab791{ 
public static void main(String args[]) { 
List<Integer> mylist = new ArrayList<>(); 
mylist.add(10); 
mylist.add(20); 
mylist.add(30); 
Enumeration<Integer> enms = 
Collections.enumeration(mylist); 
while(enms.hasMoreElements()){ 
System.out.println(enms.nextElement()); 
} 
System.out.println("----------------------"); 
Vector<Integer> myvector = new Vector<>(); 
myvector.add(10); 
myvector.add(20); 
myvector.add(30); 
Enumeration<Integer> enm = 
myvector.elements(); 
ArrayList<Integer> alist = 
Collections.list(enm); 
System.out.print(alist); 
} 
}