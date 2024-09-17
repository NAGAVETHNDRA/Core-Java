
import java.util.*;

public class Lab726{

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
String x = it.next().toString();
int index = it.nextIndex();
System.out.println(index +" \t "+x);

}


}

}