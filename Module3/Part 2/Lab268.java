class Hello{
int a;
static int b;
{
System.out.println("I am IB");
a=10;
System.out.println(a);
}
static{
System.out.println("I am SB");
b=10;
System.out.println(b);
}}
class Lab268{
public static void main(String as[]){
System.out.println("In Main:"+Hello.b);

}
}