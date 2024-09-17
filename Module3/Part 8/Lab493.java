interface inter1{
void show();
}
class Hai{
public void show(){
System.out.println("Hai-show");
}
}
class Hello extends Hai implements inter1{
}
class Lab493{
public static void main(String as[]){
Hello h=new Hello();
h.show();
}
}