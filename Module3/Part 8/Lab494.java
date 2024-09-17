interface inter{
int A=10;
}
class Hello implements inter{
void show(){
System.out.println(A);
System.out.println(inter1.A);
}
}
class Lab494{
public static void main(String as[]){
Hello h=new Hello();
h.show();
}
}