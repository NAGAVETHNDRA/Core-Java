class Hai{
void m1(){
System.out.println("Hai-m1()");
}
}
class Hello extends Hai{
void m1(){
System.out.println("Hello-m1()");
}
}
class  Lab454{
public static void main(String as[]){

Hello hello=new Hello();
hello.m1();

}
}