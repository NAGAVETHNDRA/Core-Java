import java.util.*;
public class Lab707{

public static void main(String ar[]){

Properties mypro = new Properties();
mypro.put("java",10);
mypro.put("py",20);
mypro.put("c",30);
mypro.put("c++",88);

System.out.println(mypro);

Enumeration en = mypro.keys();
while(en.hasMoreElements()){

Object  x = en.nextElement();
//System.out.println( en.nextElement());
Object y = mypro.get(x);

System.out.println(x +"\t"+y);
}


}

}