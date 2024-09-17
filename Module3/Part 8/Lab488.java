interface inter1{
void m1();
}
interface inter2{
void m2();
}

class Hello implements inter1,inter2{
public void m1(){
System.out.println("Hai m1");
}
public void m2(){
System.out.println("Hello m2");
}
}
class Lab488{
public static void main(String as[]){
Hello hello=new Hello();
hello.m1();
hello.m2();
}
}