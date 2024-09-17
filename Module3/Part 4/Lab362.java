class Hello{

void show(int a){
System.out.println("show-begin:a="+a);
a=a+10;
System.out.println("show-end:a="+a);
}
}
class Lab362{
public static void main(String as[]){
int a=10;
System.out.println("main:a="+a);
Hello h=new Hello();
h.show(a);
System.out.println("main end:a="+a);
}
}