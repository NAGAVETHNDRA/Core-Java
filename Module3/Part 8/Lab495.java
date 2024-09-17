interface inter{
int A=10;
}
class Hai{
int A=20;
}
class Hello extends Hai implements inter{
void show(){
System.out.println(A);
System.out.println(inter1.A);
}
}
class Lab495{
public static void main(String as[]){
Hello h=new Hello();
h.show();
}
}