import java.util.*;
import java.util.Arrays;
public class Lab711{

public static void main(String ar[]){


List courselist = new ArrayList<>();
courselist.add("java");
courselist.add("python");
courselist.add("spring");

System.out.println(courselist);

List Pricelist = new ArrayList();

Pricelist.add (10);
Pricelist.add(20);
Pricelist.add(30);

System.out.println(Pricelist);


courselist.addAll(Pricelist);


System.out.println(courselist);



System.out.println(courselist.retainAll(Pricelist));

System.out.println(courselist);





}

}