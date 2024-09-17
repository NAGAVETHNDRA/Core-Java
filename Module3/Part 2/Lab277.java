class Hello{
static int b=20;
static
{
System.out.println("I am IB 1");
static int c=30;
System.out.println(b);
System.out.println(c);
}

}


class Lab277{
public static void main(String as[]){
Hello h=new Hello();
}
}