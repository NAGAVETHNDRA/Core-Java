class Hello{
int fact(int n){
if(n==0||n==1)
return 1;
return n*fact(n-1);
}
}
class Lab368{
public static void main(String as[]){
Hello h=new Hello();
int fact=h.fact(3);
System.out.println("fact:"+fact);
}
}