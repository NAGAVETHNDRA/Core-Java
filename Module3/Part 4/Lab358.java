class Hello{

void show(long a){
System.out.println("show(long)");
}
}
class Lab358{
public static void main(String as[]){
Hello h=new Hello();
byte b=10;
h.show(b);
short s=20;
h.show(s);
int a=30;
h.show(a);
long x=90;
h.show(x);
}
}