interface inter{
int A=10;
}
class Hai{
int A=20;
}
class Hello extends Hai implements inter{
int A=30;
void show(){
int A=40;
System.out.println(A);
System.out.println(this.A);
System.out.println(super.A);
System.out.println(inter.A);
}
}
class Lab496{
public static void main(String as[]){
Hello h=new Hello();
h.show();
}
}