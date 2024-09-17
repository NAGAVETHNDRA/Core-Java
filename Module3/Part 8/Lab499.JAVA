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
}
}
}
public class Lab499{
public static void main(String as[]){
outer myouter=new outer();
myouter.m1();
myouter.m2();
}
}

