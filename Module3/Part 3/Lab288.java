class Hello{
int a;
int b;
int c;
void show(){
System.out.println(a+"\t"+b+"\t"+c);
}}
class Lab288{
public static void main(String as[]){
Hello h1=new Hello();
h1.a=10;
h1.b=20;
h1.c=30;


h1.show();

Hello h2=new Hello();
h2.a=1;
h2.b=2;
h2.c=3;
h2.show();

Hello h3=new Hello();
h3.a=11;
h3.b=22;
h3.c=33;
h3.show();

}
}




