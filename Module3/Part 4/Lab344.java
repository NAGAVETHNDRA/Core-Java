class Hello{
void sum(int a,int b){
System.out.println("sum(int,int)");
}
void sum(String a,int b){
System.out.println("sum(String,int)");

}

}
class Lab344{
public static void main(String as[]){
Hello h=new Hello();
h.sum(10,20);
h.sum("JLC",40);
}
}