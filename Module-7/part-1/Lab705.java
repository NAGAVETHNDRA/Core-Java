import java.util.*;
public class Lab705{

public static void main(String ar[]){

Stack <Integer>mystack = new Stack<Integer>();
mystack.addElement(10);
mystack.addElement(20);
mystack.addElement(30);
mystack.addElement(88);

System.out.println(mystack);

Enumeration<Integer> en = mystack.elements();
while(en.hasMoreElements()){

Integer x = en.nextElement();
//System.out.println( en.nextElement());
System.out.println(x);
}



}

}