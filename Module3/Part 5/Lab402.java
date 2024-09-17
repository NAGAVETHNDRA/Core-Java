
class Hai {
static int a=10;
static
{
System.out.println("Hai-I.B:"+a);
}
}
class Hello extends Hai {
static int b=20;
static
{
System.out.println("Hello-I.B:"+a);
System.out.println("Hello-I.B:"+b);
}
}
class Lab402{
public static void main(String args[]){
Hello h=new Hello();
}
}
