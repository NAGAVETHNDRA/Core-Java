class Hai{
void m1(int a){
System.out.println("Hai-m1(int)");
}
}
class Hello extends Hai{
void m1(int a){
System.out.println("Hello-m1(int)");
return 9;
}
}
class  Lab441{
public static void main(String as[]){

Hello hello=new Hello();
hello.m1(10);

}
}