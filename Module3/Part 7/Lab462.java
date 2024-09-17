class Hai{
static void m1(){
System.out.println("Hai-m1()");
}
}
class Hello extends Hai{
void m1(){
System.out.println("Hello-m1()");
}
}
class  Lab462{
public static void main(String as[]){

Hai hai=new Hello();
hello.m1();

}
}