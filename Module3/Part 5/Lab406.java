
class A {
int a=10;
static int b=20;
{
System.out.println("A-I.B");
}
static {
System.out.println("A-S.B");
}
A(){
System.out.println("A-D.C");
}
}
class B extends A{
int c=30;
static int d=40;
{
System.out.println("B-I.B");
}
static {
System.out.println("B-S.B");
}

B(){
System.out.println("B-D.C");
}
}
class C extends B{
int e=50;
static int f=60;
{
System.out.println("C-I.B");
}
static {
System.out.println("C-S.B");
}
C(){
System.out.println("C-B.C");
}
}

class Lab406{
public static void main(String args[]){
new C();
}
}
