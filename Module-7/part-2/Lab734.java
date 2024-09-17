
import java.util.*;

public class Lab734{

public static void main(String ar[]){

Set<String> courselist = new TreeSet<>();
courselist.add("Dsa");
courselist.add("python");
courselist.add("Spring");
courselist.add("java");
courselist.add("C++");
//courselist.add(20);
//courselist.add(99.99);

System.out.println(courselist);



Iterator<String> it = courselist.iterator();
while(it.hasNext()){
String str = it.next();
System.out.println(str);
}



}

}
