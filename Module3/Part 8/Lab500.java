class outer {
int a=10;
static int b=20;
void m1(){
System.out.println("outer-m1()");
}
static void m2(){
System.out.println("outer-m2()");
}
class inner{
int x=99;
final static int y=88;
void showin(){
System.out.println("Inner-showin()");
System.out.println(x);
System.out.println(y);
System.out.println(a);
System.out.println(b);
m1();
m2();
}
}
}
public class Lab500{
public static void main(String as[]){
outer myouter=new outer();
myouter.m1();
myouter.m2();

outer.inner myinner=new outer().new inner();
myinner.showin();
}
}

