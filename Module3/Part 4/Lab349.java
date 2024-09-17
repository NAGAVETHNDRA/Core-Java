class Hello{
void sum(byte a,int b){
System.out.println("sum(byte,int)");
}
}
class Lab349{
public static void main(String as[]){
Hello h=new Hello();
byte b1=10;
byte b2=20;
h.sum(b1,b2);}
}