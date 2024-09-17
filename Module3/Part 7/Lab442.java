class Hai{
long m1(int a){
System.out.println("Hai-m1(int)");
return 9;
}
}
class Hello extends Hai{
long m1(int a){
System.out.println("Hello-m1(int)");
return 9;
}
}
class  Lab442{
public static void main(String as[]){

Hello hello=new Hello();
hello.m1(10);

}
}