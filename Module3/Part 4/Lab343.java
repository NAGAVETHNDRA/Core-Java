class Hello{
void sum(int a,int b){
System.out.println("sum(int,int)");
}
int sum(int a,int b,int c){
System.out.println("sum(int,int,int)");
return 99;

}

}
class Lab343{
public static void main(String as[]){
Hello h=new Hello();
h.sum(10,20);
h.sum(10,20,30);
}
}