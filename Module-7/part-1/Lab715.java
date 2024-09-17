import java.util.*;

public class Lab715{

public static void main(String ar[]){


List<String> courselist = new ArrayList<>();
courselist.add("java");
courselist.add("python");
courselist.add("spring");



courselist.add("springBoot");
System.out.println(courselist);

courselist.add("java");

System.out.println(courselist.indexOf("java"));

System.out.println(courselist.lastIndexOf("java"));

System.out.println(courselist.set(1,"DSA"));

System.out.println(courselist.get(3));

courselist.remove(2);
System.out.println(courselist);


}

}