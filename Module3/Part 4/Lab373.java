class Hello{

void show(int x,int...arr){
System.out.println("show(int...arr)");
System.out.println("x:"+x);
System.out.println("Length:"+arr.length);
}
}
class Lab373{
public static void main(String as[]){
Hello h=new Hello();
h.show(10);
}
}