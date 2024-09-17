class Hello{

void show(int a,int b){
System.out.println("show(int,int)");
}
void show(int a,int b,int c){
System.out.println("show(int,int,int)");
}
}
class Lab369{
public static void main(String as[]){
Hello h=new Hello();
h.show(10,20);
h.show(10,20,30);
}
}