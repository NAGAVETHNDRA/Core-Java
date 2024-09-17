class Hello{
void sum(int a,String b){
System.out.println("sum(int,String)");
}
void sum(String a,int b){
System.out.println("sum(String,int)");

}

}
class Lab345{
public static void main(String as[]){
Hello h=new Hello();
h.sum(10,"JLC");
h.sum("JLC",40);
}
}