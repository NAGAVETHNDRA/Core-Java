class Hello{
int a=10;
void show(){
System.out.println(a);
System.out.println(this.a);
}
}
class Lab300{
public static void main(String as[]){
Hello h=new Hello();
h.show();

}
}