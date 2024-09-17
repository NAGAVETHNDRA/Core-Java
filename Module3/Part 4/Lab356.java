class Hello{

void show(String str){
System.out.println("show(String)");
}
void show(Object obj){
System.out.println("show(Object)");
}

void show(Hello hello){
System.out.println("show(Hello)");
}

}
class Lab356{
public static void main(String as[]){
Hello h=new Hello();

h.show(null);
}
}