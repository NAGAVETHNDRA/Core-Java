interface inter1{
void m1();
void m3();
}
interface inter2{
void m2();
void m3();
}

class Hello implements inter1,inter2{
public void m1(){
System.out.println("Hello m1");
}
public void m2(){
System.out.println("Hello m2");
}
public void m3(){
System.out.println("Hello m3");
}
}
class Lab489{
public static void main(String as[]){
inter1 iref1=new Hello();
iref1.m1();
//iref1.m2();
iref1.m3();


inter2 iref2=new Hello();
//iref2.m1();
iref2.m2();
iref2.m3();
}
}