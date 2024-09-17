import java.util.*;

public class Lab723{

public static void main(String ar[]){


List<Integer> courselist = new ArrayList<>();
courselist.add(10);
courselist.add(20);
courselist.add(30);
courselist.add(40);
courselist.add(50);
courselist.add(60);

System.out.println(courselist);

Iterator <Integer> myitr = courselist.iterator();


System.out.println("Using iterato");

ListIterator <Integer> it = courselist.listIterator();
while(it.hasNext()){
Integer x = it.next();
//System.out.println(x);
if(x==30){
//it.remove();
it.add(99);
break;
}
}

System.out.println(courselist);

}

}