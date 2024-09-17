class Hello{
int a;
Hello(){
System.out.println("0 org-con");
}
void Hello(int x){
System.out.println("1 org-methos");
a=x;
}
void show(){
System.out.println("show() method");
System.out.println(a);

}
}
class Lab295{
public static void main(String as[]){

Hello h=new Hello();
h.show();
h.Hello(99);

}}


