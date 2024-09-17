class A{
static void m1(){
System.out.println("A-m1()");
}
}
class B extends A{
static void m1(){
System.out.println("B-m1()");
}
}
class C extends A{
static void m1(){
System.out.println("C-m1()");
}
}

class  Lab467{
public static void main(String as[]){

A ao=null;

ao=new B();
ao.m1();


ao=new C();
ao.m1();


}
}