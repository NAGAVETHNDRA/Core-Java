class Hai{
int a=10;
void m1(){
System.out.println(a);
System.out.println(b);
}
}
class Hello extends Hai{
int b=20;
void m2(){
System.out.println(a);
System.out.println(b);
}
}

class Lab392{
public static void main(String args[]){
Hello hello=new Hello();
hello.m1();
hello.m2();
}
}
