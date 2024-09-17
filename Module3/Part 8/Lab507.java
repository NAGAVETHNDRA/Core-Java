class Hello {
int a=10;
static int b=20;

void m1(){
System.out.println("m1-begin");
class inner{
int x=10;
final static int y=20;
void show(){
System.out.println("inner-show");
System.out.println(x);
System.out.println(y);
System.out.println(a);
System.out.println(b);
}
}
inner in=new inner();
in.show();
System.out.println("m1-end");
}
void m2(){
//inner in=new inner();
}
}
class Lab507{
public static void main(String as[]){
Hello h=new Hello();
h.m1();
}
}

