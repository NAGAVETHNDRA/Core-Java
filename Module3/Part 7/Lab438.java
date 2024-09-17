class Hai{
void m1(){
System.out.println("Hai-m1()");
}
void m2(){
System.out.println("Hai-m2()");
}
}
class Hello extends Hai{
void m2(){
System.out.println("Hello-m2()");
}
void m3(){
System.out.println("Hello-m3()");
}
}
class  Lab438{
public static void main(String as[]){

Hello hello=new Hello();
hello.m1();
hello.m2();
hello.m3();

}
}