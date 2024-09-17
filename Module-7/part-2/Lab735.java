
import java.util.*;

public class Lab735{

public static void main(String ar[]){

Set<Integer> courselist = new TreeSet<>();
courselist.add(50);
courselist.add(20);
courselist.add(70);
courselist.add(80);
courselist.add(10);
courselist.add(60);
courselist.add(99);

System.out.println(courselist);



Iterator<Integer> it = courselist.iterator();
while(it.hasNext()){
Integer str = it.next();
System.out.println(str);
}



}

}
