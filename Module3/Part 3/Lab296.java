class Hello{
int a;

void Hello(int x){
System.out.println("1 org-methos");
a=x;
}
void show(){
System.out.println("show() method");
System.out.println(a);

}
}
class Lab296{
public static void main(String as[]){

Hello h=new Hello(99);
h.show();


}}


