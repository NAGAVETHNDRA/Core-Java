class A{
int x=10;
}
class B extends A{
String x="JLC";
}

class  Lab468{
public static void main(String as[]){

A ao=new B();
System.out.println(ao.x);
}
}