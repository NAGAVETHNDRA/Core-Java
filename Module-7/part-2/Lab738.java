
import java.util.*;

public class Lab738{

public static void main(String ar[]){

TreeSet<Integer> courselist = new TreeSet<>();
courselist.add(50);
courselist.add(20);
courselist.add(70);
courselist.add(80);
courselist.add(10);
courselist.add(60);
courselist.add(99);

System.out.println(courselist);

Set<Integer> mys1 = courselist.descendingSet();
System.out.println(mys1);

Iterator<Integer> it1 = mys1.iterator();
while(it1.hasNext()){
System.out.println(it1.next());
}
System.out.println();

Iterator<Integer> it2 = mys1.iterator();
while(it2.hasNext()){
System.out.println(it2.next());
}


}
}
