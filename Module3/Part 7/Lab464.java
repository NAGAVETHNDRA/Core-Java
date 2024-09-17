class Hello{
void sum(int a,int b){
System.out.println("Hai-sum(int,int)");
}
void sum(int a,int b,int c){
System.out.println("Hello-sum(int,int,int)");
}
}
class  Lab464{
public static void main(String as[]){

Hello h=new Hello();
h.sum();
h.sum(10,20);
h.sum(10,20,30);
}
}