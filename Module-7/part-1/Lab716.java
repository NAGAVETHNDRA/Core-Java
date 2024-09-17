import java.util.*;

public class Lab716{

public static void main(String ar[]){


List<String> courselist = new ArrayList<>();
courselist.add("java");
courselist.add("python");
courselist.add("spring");
courselist.add("c++");
courselist.add("html");
courselist.add("js");

System.out.println(courselist);

List<String> mylist = courselist.subList(2,4);

System.out.println(mylist);


List<String> mylist2 = courselist.subList(3,5);


System.out.println(mylist2);













}

}