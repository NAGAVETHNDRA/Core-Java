
import java.util.*;

public class Lab731{

public static void main(String ar[]){

Set courselist = new HashSet();
courselist.add("Dsa");
courselist.add("python");
courselist.add("Spring");
courselist.add("java");
courselist.add("C++");
courselist.add(20);
courselist.add(99.99);

System.out.println(courselist);



List<Integer> mylist = new ArrayList<>();

mylist.add(10);
mylist.add(20);
mylist.add(40);
mylist.add(40);
mylist.add(50);
mylist.add(60);
mylist.add(50);

System.out.println(mylist);

Set<Integer> myset = new HashSet<>(mylist);
System.out.println(mylist);


}

}
