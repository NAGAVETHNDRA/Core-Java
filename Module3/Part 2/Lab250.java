class Hello{
int a=10;
static int b=20;
void m1(){
System.out.println(a);
System.out.println(b);
}
static void m2(){
//System.out.println(a);
System.out.println(b);
}
}
class Lab250{
public static void main(String as[]){
Hello h =new Hello();
Hello.m2();
h.m1();
}
}