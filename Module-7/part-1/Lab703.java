import java.util.*;
public class Lab703{

public static void main(String ar[]){

Vector myvect = new Vector();
myvect.addElement(10);
myvect.addElement(20);
myvect.addElement("venkatesh");
myvect.addElement(88.88);

System.out.println(myvect);

Enumeration en = myvect.elements();
while(en.hasMoreElements()){

Object x = en.nextElement();
//System.out.println( en.nextElement());
System.out.println(x);
}



}

}