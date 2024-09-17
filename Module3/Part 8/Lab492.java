interface inter1{
void show();
}
class Hai{
public void show(){
System.out.println("Hai-show");
}
}
class Hello implements inter1 extends Hai {
}
class Lab492{
public static void main(String as[]){
Hello h=new Hello();
h.show();
}
}