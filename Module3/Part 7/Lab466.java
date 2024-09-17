class A{
void m1(){
System.out.println("A-m1()");
}
void m2(){
System.out.println("A-m2()");
}
}
class B extends A{
void m2(){
System.out.println("B-m2()");
}
void m3(){
System.out.println("B-m3()");
}
}
class C extends A{
void m2(){
System.out.println("C-m2()");
}
void m4(){
System.out.println("C-m4()");
}
}

class  Lab466{
public static void main(String as[]){

A ao=null;

ao=new B();
ao.m3();


ao=new C();
ao.m4();


}
}