class Hello{

void show(Object obj){
System.out.println("show(Object)");
}
}
class Lab353{
public static void main(String as[]){
Hello h=new Hello();
h.show("JLC");
h.show(null);
}
}