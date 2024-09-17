class Hello{

void show(byte a){
System.out.println("show(byte)");
}
void show(short a){
System.out.println("show(short)");
}
void show(int a){
System.out.println("show(int)");
}
void show(float a){
System.out.println("show(float)");
}
void show(long a){
System.out.println("show(long)");
}
void show(double a){
System.out.println("show(double)");
}
}
class Lab359{
public static void main(String as[]){
Hello h=new Hello();
byte b=10;
h.show(b);
short s=20;
h.show(s);
int a=30;
h.show(a);
float f=10;
h.show(f);
long x=90;
h.show(x);
double d=8.8;
h.show(d);
}
}