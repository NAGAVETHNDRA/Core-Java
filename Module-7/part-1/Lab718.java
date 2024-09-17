import java.util.*;

public class Lab718{

public static void main(String ar[]){


List<Integer> courselist = new ArrayList<>();
courselist.add(10);
courselist.add(20);
courselist.add(30);
courselist.add(40);
courselist.add(50);
courselist.add(60);

System.out.println(courselist);

ListIterator <Integer> myitr = courselist.listIterator();

System.out.println("Forword Order");

while(myitr.hasNext()){

int str = myitr.next();
System.out.println(str);


}


System.out.println("Backword order");


//ListIterator<String>myit = courselist.iterator();

while(myitr.hasPrevious()){

int str = myitr.previous();
System.out.println(str);


}


}

}