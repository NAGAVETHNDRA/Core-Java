
import java.util.*;

public class Lab725{

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
String x = it.next();
if(x.equals("Spring")){
it.set("Spring boot -v.12");
break;
}
}

System.out.println(courselist);

}

}