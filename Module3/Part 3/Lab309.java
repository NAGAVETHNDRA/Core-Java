class Hello{
static int a=10;


static void show(){
int a=20;
System.out.println(this.a);
System.out.println(a);
}
}
class Lab309{
public static void main(String as[]){
Hello h=new Hello();
h.show();

}
}