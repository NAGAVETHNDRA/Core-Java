class Hello{
static int b=20;
static
{
System.out.println("I am IB 1");
final int c=30;
System.out.println(b);
System.out.println(c);
}

}


class Lab276A{
public static void main(String as[]){
Hello h=new Hello();
}
}