class Hello{
void sum(int a,int b){
int sum=a+b;
System.out.println(sum);
}
int sum(int a,int b){
int sum=a+b;
return sum;

}

}
class Lab342{
public static void main(String as[]){
Hello h=new Hello();
h.sum(10,20);

}
}