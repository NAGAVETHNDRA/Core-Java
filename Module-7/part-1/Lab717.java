import java.util.*;

public class Lab717{

public static void main(String ar[]){


List<String> courselist = new ArrayList<>();
courselist.add("java");
courselist.add("python");
courselist.add("spring");
courselist.add("c++");
courselist.add("html");
courselist.add("js");

System.out.println(courselist);

Iterator <String> myitr = courselist.iterator();

while(myitr.hasNext()){

String str = myitr.next();
System.out.println(str);



}



}

}