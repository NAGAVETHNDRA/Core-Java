class A{}
class B extends A{}
class c extends B{}
class D{}

class Hai{
B m1(){
System.out.println("Hai-m1()");
return new B();
}
}
class Hello extends Hai{
B m1(){
System.out.println("Hello-m1()");
return new B();
}
}
class  Lab444{
public static void main(String as[]){

Hello hello=new Hello();
hello.m1();

}
}