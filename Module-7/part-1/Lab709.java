import java.util.*;
import java.util.Arrays;
public class Lab709{

public static void main(String ar[]){


List<String> mylist = new ArrayList<>();
mylist.add("java");
mylist.add("python");
mylist.add("spring");

System.out.println(mylist);

Iterator<String> myitr = mylist.iterator();

while(myitr.hasNext()){

String str = myitr.next();
System.out.println(str);
}


Object myarr[] = mylist.toArray();




for(Object obj : myarr){
System.out.println(obj);
}




}

}