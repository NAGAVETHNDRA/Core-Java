class Hai{
int a=10;
}
class Hello extends Hai{
int b=20;
}

class Lab390{
public static void main(String args[]){
Hai hai=new Hai();
System.out.println(hai.a);
System.out.println(hai.b);
Hello hello=new Hello();
System.out.println(hello.a);
System.out.println(hello.b);
}
}
