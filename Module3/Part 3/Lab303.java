class Hello{
int a;
int b;
int c;
Hello(int a,int b,int c){
this.a=a;
this.b=b;
this.c=c;
}
void show(){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
}
class Lab303{
public static void main(String as[]){
Hello h=new Hello(10,20,30);
h.show();

}
}