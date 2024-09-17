class Hai{
void m1(int a){
System.out.println("Hai-m1(int)");
}
}
class Hello extends Hai{
void m1(String str){
System.out.println("Hello-m1(String str)");
}
}
class  Lab440{
public static void main(String as[]){

Hello hello=new Hello();
hello.m1(10);
hello.m1("jlc");
}
}