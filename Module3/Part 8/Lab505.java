class outer {
int a=10;
static int b=20;
void m1(){
System.out.println("outer-m1()");
inner in=new inner();
in.show();
}
static void m2(){
System.out.println("outer-m2()");
inner in=new inner();
in.show();
}
static class inner{
int x=99;
static int y=88;
void show(){
System.out.println("Inner-show()");
}
}
}
class Lab505{
public static void main(String as[]){
outer out=new outer();
out.m1();
out.m2();
outer.inner myinner=new outer.inner();
myinner.show();
}
}

