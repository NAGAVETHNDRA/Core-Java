
import java.util.*;

public class Lab729{

public static void main(String ar[]){


LinkedList courselist = new LinkedList();
System.out.println(courselist.size());

courselist.add("Dsa");
courselist.add("python");
courselist.add("Spring");
courselist.add("java");
courselist.add("C++");
courselist.add("Oracle");
System.out.println(courselist);

courselist.add(2,"springboot");

System.out.println(courselist);


System.out.println("------------------------------");

System.out.println(courselist.getFirst());
System.out.println(courselist.getLast());

courselist.addFirst("Hello");
courselist.addLast("hai");

System.out.println(courselist);

System.out.println(courselist.removeFirst());
System.out.println(courselist.removeLast());

System.out.println("--------------------------------");

System.out.println("Using iterator");

Iterator it = courselist.iterator();

while(it.hasNext()){
System.out.println(it.next());
}
}

}