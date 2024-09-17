import java.util.*;

public class Lab714{

public static void main(String ar[]){


List courselist = new ArrayList<>();
courselist.add("java");
courselist.add("python");
courselist.add("spring");



courselist.add("springBoot");
System.out.println(courselist);

System.out.println(courselist.get(3));

courselist.remove(2);
System.out.println(courselist);


}

}