class A{
int a;
A(){
System.out.println("A-0 arg con");
}
A(int a){
System.out.println("A-1 arg con");
this.a=a;
}
}
class B extends A{
int b;
B(){
System.out.println("B-0 arg con");
}
B(int a,int b){
super(a);
System.out.println("B-2 arg con");
this.b=b;
}
}
class C extends B{
int c;
C(){
System.out.println("C-0 arg con");
}
C(int a,int b,int c){
super(a,b);
System.out.println("C-3 arg con");
this.c=c;
}
void show(){
System.out.println("c-show()");
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
}
class Lab415{
public static void main(String args[]){
C co1=new C();
co1.show();
C co2=new C(10,20,30);
co2.show();

}
}
