import java.util.*;
public class Lab706{

public static void main(String ar[]){

Hashtable<String,Integer> myhas = new Hashtable<String,Integer>();
myhas.put("java",10);
myhas.put("py",20);
myhas.put("c",30);
myhas.put("c++",88);

System.out.println(myhas);

Enumeration<String> en = myhas.keys();
while(en.hasMoreElements()){

String  x = en.nextElement();
//System.out.println( en.nextElement());
Integer y = myhas.get(x);

System.out.println(x +"\t"+y);
}


}

}