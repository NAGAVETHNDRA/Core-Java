
import java.util.*;

public class Lab736{

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

Set<Integer> myset1 = courselist.subSet(30,70);
System.out.println(myset1);

Set<Integer> myset2 = courselist.subSet(30, false,70,false);
System.out.println(myset2);

Set<Integer> myset3 = courselist.subSet(30,true,70,true);
System.out.println(myset3);

Set<Integer> myset4 = courselist.headSet(50);
System.out.println(myset4);

Set<Integer> myset5 = courselist.tailSet(60);
System.out.println(myset5);

Set<Integer> myset7 = courselist.tailSet(60,true);
System.out.println(myset7);





}
}
