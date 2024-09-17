class Hello{
int b;
}
class Lab254{
public static void main(String as[]){
Hello h1= new Hello();
Hello h2= new Hello();
System.out.println(h1.b+"\t"+h2.b);
h1.b=10;
System.out.println(h1.b+"\t"+h2.b);
}
}