class Hello{

void show(int...arr){
System.out.println("show(int...arr)");
for(int x:arr)
System.out.println(x);

}
}
class Lab371{
public static void main(String as[]){
Hello h=new Hello();
h.show(10,20);
h.show(10,20,30);
}
}