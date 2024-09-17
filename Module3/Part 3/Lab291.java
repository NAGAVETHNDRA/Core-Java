class Hello{
int a;
{
System.out.println("instance Block");
System.out.println(a);
}
Hello(){
System.out.println("0 org-con");
}
Hello(int x){
System.out.println("1 org-con");
a=x;
}
void show(){
System.out.println("show() method");
System.out.println(a);
}}
class Lab291{
public static void main(String as[]){

Hello h1=new Hello();
h1.show();
}}


