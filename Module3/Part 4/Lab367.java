class Hello{
int sum(int n){
if(n==1)
return 1;
return n+sum(n-1);
}
}
class Lab367{
public static void main(String as[]){
Hello h=new Hello();
int sum=h.sum(5);
System.out.println("sum:"+sum);
}
}