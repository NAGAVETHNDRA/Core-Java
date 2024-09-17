class Hello{
int a;
int b;
int c;
void show(){
System.out.println(a+"\t"+b+"\t"+c);
}
 Hello(int x,int y,int z){
a=x;
b=y;
c=z;
}}
class Lab290{
public static void main(String as[]){
Hello h1=new Hello(10,20,30);
h1.show();

Hello h2=new Hello(100,200,300);
h2.show();

Hello h3=new Hello(11,22,33);
h3.show();

}
}




