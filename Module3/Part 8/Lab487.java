interface inter1{
int A=10;
int B=20;
void m1();
void m2();
}
abstract class Hai implements inter1{
public void m1(){
System.out.println("Hai m1");
System.out.println(A);
System.out.println(B);
}
}
class Hello extends Hai{
public void m2(){
System.out.println("Hello m2");
System.out.println(A);
System.out.println(B);
}
void m3(){
System.out.println("Hello m3");
}
}
class Lab487{
public static void main(String as[]){
inter1 iref=new Hello();
iref.m1();
iref.m2();
iref.m3();

}
}