class Hello{
void m1(){
int c=10;
{
System.out.println("I am local");
System.out.println(c);
}
}
}


class Lab283{
public static void main(String as[]){
Hello h=new Hello();
h.m1();
}
}