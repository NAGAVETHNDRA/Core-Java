class Hello{

void show(int...arr){
System.out.println("show(int...arr)");
}
void show(String...arr){
System.out.println("show(String...arr)");
}
}
class Lab374{
public static void main(String as[]){
Hello h=new Hello();
h.show(10);
h.show("Chinna");
h.show();
}
}