class Hello{
static int b;
}
class Lab253{
public static void main(String as[]){
Hello h= new Hello();
System.out.println(h.b);
h.b=10;
System.out.println(h.b);
}
}