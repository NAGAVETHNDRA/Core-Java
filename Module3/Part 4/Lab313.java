class Hello{
int a=20;
static int b=30;

void m1(){
System.out.println("I am m1");
}
static void m2(){
System.out.println("I am m2");
}
static void show(){
System.out.println(a);
System.out.println(b);
m1();
m2();
}}
class Lab313{
public static void main(String as[]){
Hello h=new Hello();
h.show();

}
}