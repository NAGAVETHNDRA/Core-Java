class Hello{
int a;
int b;
Hello(int a,int b){
this.a=a;
this.b=b;
}
}

class Lab520{
public static void main(String as[]){
Hello h1=new Hello(10,20);
Hello h2=new Hello(10,20);
Hello h3=new Hello(50,60);
Hello h4=h3;
System.out.println(h1==h2);
System.out.println(h1==h3);
System.out.println(h2==h3);
System.out.println(h4==h3);

}
}

