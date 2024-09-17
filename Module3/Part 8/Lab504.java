class outer {
int a=10;
static int b=20;
void m1(){
System.out.println("outer-m1()");
}
static void m2(){
System.out.println("outer-m2()");
}
static class inner{
int x=99;
static int y=88;
void show(){
System.out.println("Inner-show()");
System.out.println(x);
System.out.println(y);
//System.out.println(a);
System.out.println(b);
//m1();
m2();
}
}
}
class Lab504{
public static void main(String as[]){
outer.inner myinner=new outer.inner();
myinner.show();
}
}

