class Hello{
int a=10;
void show(){
int a=20;
System.out.println(a);
System.out.println(this.a);
}
}
class Lab299{
public static void main(String as[]){
Hello h=new Hello();
h.show();

}
}