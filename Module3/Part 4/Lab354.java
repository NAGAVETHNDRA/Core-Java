class Hello{

void show(Object obj){
System.out.println("show(Object)");
}
void show(Hello hello){
System.out.println("show(Hello)");
}

}
class Lab354{
public static void main(String as[]){
Hello h=new Hello();

h.show(null);
}
}