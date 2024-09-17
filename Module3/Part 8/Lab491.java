interface inter1{
int A=10;
int B=20;
}
interface inter2{
int A=99;
int C=30;
}

class Hello implements inter1,inter2{
public void show(){
System.out.println("Hello-show");
System.out.println(inter1.A);
System.out.println(B);
System.out.println(inter2.A);
System.out.println(C);
}
}
class Lab491{
public static void main(String as[]){
Hello h=new Hello();
h.show();
}
}