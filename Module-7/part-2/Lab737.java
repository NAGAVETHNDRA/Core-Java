
import java.util.*;

public class Lab737{

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

System.out.println(courselist.first());
System.out.println(courselist.last());

System.out.println(courselist.lower(50));
System.out.println(courselist.higher(60));

System.out.println(courselist.floor(50));
System.out.println(courselist.ceiling(60));

System.out.println(courselist.pollFirst());
System.out.println(courselist.pollLast());
System.out.println(courselist);


}
}
