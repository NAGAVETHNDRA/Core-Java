class Hello{
void sum(int a,byte b){
System.out.println("sum(int,byte)");
}
}
class Lab347{
public static void main(String as[]){
Hello h=new Hello();
byte b1=10;
byte b2=20;
h.sum(b1,b2);
}
}