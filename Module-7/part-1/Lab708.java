import java.util.*;
public class Lab708{

public static void main(String ar[]){


List<String> mylist = new ArrayList<>();

System.out.println(mylist.isEmpty());
mylist.add("java");
mylist.add("python");
mylist.add("spring");

System.out.println(mylist);

System.out.println(mylist.isEmpty());
System.out.println(mylist.size());

System.out.println(mylist.contains("python"));
System.out.println(mylist.contains("dsa"));

System.out.println(mylist.remove("python"));

System.out.println(mylist);

mylist.clear();

System.out.println(mylist);





}

}