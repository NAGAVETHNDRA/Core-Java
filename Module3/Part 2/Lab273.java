class Hello{
{
System.out.println("I am IB 1");
}
{
System.out.println("I am IB 2");
}

static{
System.out.println("I am SB 1");
}
static{
System.out.println("I am SB 2");
}

}
class Lab273{
public static void main(String as[]){
Hello h1=new Hello();
Hello h2=new Hello();
Hello h3=new Hello();
}
}