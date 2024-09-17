class Hello{

void show(int a){
System.out.println("show(int)");
}
void show(long a){
System.out.println("show(long)");
}
}
class Lab357{
public static void main(String as[]){
Hello h=new Hello();
byte b=10;
h.show(b);
short s=20;
h.show(s);
}
}