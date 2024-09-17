class Hello{
void show(String str){
System.out.println("sum(String)");
}
void sum(Object obj){
System.out.println("sum(Object)");
}
}
class Lab352{
public static void main(String as[]){
Hello h=new Hello();
h.show("JLC");
h.show(null);
}
}