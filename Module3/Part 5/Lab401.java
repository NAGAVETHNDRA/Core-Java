
class Hai {
int a=10;
{
System.out.println("Hai-I.B:"+a);
}
}
class Hello extends Hai {
int b=20;
{
System.out.println("Hello-I.B:"+a);
System.out.println("Hello-I.B:"+b);
}
}
class Lab401{
public static void main(String args[]){
Hello h=new Hello();
}
}
