import java.util.*;

public class Lab721{

public static void main(String ar[]){


Vector<Integer> courselist = new Vector<>();
courselist.add(10);
courselist.add(20);
courselist.add(30);
courselist.add(40);
courselist.add(50);
courselist.add(60);

System.out.println(courselist);

ListIterator <Integer> myitr = courselist.listIterator();




System.out.println("Using Enumeration");

Enumeration<Integer> enu = courselist.elements();


while(enu.hasMoreElements()){

Integer s = enu.nextElement();
System.out.println(s);

}

System.out.println("Using iterato");

Iterator <Integer> it = courselist.iterator();
while(it.hasNext()){
Integer x = it.next();
System.out.println(x);
}

}

}