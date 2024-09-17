
import java.util.*;

public class Lab727{

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

ListIterator <String> it = courselist.listIterator(courselist.size());
while(it.hasPrevious()){
String x = it.previous().toString();
int index = it.previousIndex();
System.out.println(index +" \t "+x);

}


}

}