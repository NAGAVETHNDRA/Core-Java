class Hello{
int a=10;
static int b=20;
void show(){
String a="Hello";
String b="Hai";
System.out.println(a);
System.out.println(b);
System.out.println(this.a);
System.out.println(this.b);
System.out.println(Hello.b);

}
}
class Lab301{
public static void main(String as[]){
Hello h=new Hello();
h.show();

}
}