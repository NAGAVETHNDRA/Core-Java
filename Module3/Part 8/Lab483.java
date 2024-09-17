interface inter1{
int A=10;
void m1();
}
class Hello implements inter1{
void m1(){
System.out.println("Hello-m1()");
}
}
public class  Lab483{
public static void main(String as[]){
inter1 iref=new Hello();
iref.m1();
}
}