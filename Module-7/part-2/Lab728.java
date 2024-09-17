
import java.util.*;

public class Lab728{

public static void main(String ar[]){


List courselist = new ArrayList();
System.out.println(courselist.size());

courselist.add("Dsa");
courselist.add("python");
courselist.add("Spring");
courselist.add("java");
courselist.add("C++");
courselist.add("Oracle");

List mycourse = new ArrayList(courselist);
System.out.println(mycourse.size());
courselist.add("Spring boot");

System.out.println(mycourse);

Vector v = new Vector();

v.add(10);
v.add(20);
v.add(30);
v.add(40);
v.add(50);
v.add(60);

System.out.println(v);
List numlist = new ArrayList(v);

System.out.println(numlist.size());
System.out.println(numlist);

}

}