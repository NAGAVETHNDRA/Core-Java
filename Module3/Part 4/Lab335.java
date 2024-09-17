class Hello{
int show(){
System.out.println("I am show");
String str="Hello Guys";
return 99;
System.out.println("I am ok");
}
}
class Lab335{
public static void main(String as[]){
Hello h=new Hello();
String x=h.show();
System.out.println(x);
}
}