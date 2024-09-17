abstract class Hello{
int a=10;
static int b=20;
{
System.out.println("Hello-I.B");
}
static{
System.out.println("Hello-S.B"+b);
}
Hello(){
System.out.println("Hello-D.C");
}
void m1(){
System.out.println("Hello-m1()");
}
static void m2(){
System.out.println("Hello-m2()");
}
abstract void m3();
}
class Hai extends Hello{
void m3(){
System.out.println("Hai-m3()");
}
}
public class  Lab477{
public static void main(String as[]){
Hello hello=new Hai();
hello.m1();
hello.m2();
hello.m3();
}
}