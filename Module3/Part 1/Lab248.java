class Hello{
int a;
int b=20;
void show(){
System.out.println(a);
System.out.println(b);
}
}

class Lab248{
public static void main(String as[]){

Hello h1=new Hello();
h1.show();

h1.a=10;
h1.show();

}
}