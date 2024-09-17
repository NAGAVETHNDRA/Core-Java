class Hello{
int a;
int b=20;
void show(){
System.out.println(a+"\t"+b);
}
}

class Lab248A{
public static void main(String as[]){

Hello h1=new Hello();
h1.show();

h1.a=10;
h1.show();

Hello h2=new Hello();

h2.a=200;
h2.b=300;
h2.show();

}
}