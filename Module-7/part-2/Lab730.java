
import java.util.*;

public class Lab730{

public static void main(String ar[]){


List<String> courselist = new ArrayList<>();
courselist.add("Dsa");
courselist.add("python");
courselist.add("Spring");
courselist.add("java");
courselist.add("C++");
courselist.add("Oracle");

System.out.println(courselist);

//Iterator <String> myitr = courselist.iterator();


System.out.println("Using iterato");

ListIterator <String> it = courselist.listIterator();
while(it.hasNext()){
System.out.println(it.next());
courselist.add("python");

}


}

}

//java.util.ConcurrentModificationException