class Hello{
void m1(){
int a=10;
{
System.out.println("I am L.B-1");
System.out.println(a);
}
{
System.out.println("I am L.B-2");
System.out.println(a);
}
}
}


class Lab286{
public static void main(String as[]){
Hello h=new Hello();
h.m1();
}
}