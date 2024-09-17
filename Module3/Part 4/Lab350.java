class Hello{
void sum(byte a,int b){
System.out.println("sum(byte,int)");
}
void sum(int a,byte b){
System.out.println("sum(int,byte)");
}
}
class Lab350{
public static void main(String as[]){
Hello h=new Hello();
byte b1=10;
byte b2=20;
h.sum(10,b2);
h.sum(b1,20);
}
}