class Hello{
boolean isEven(int num){
if(num%2==0)
return true;
else
return false;

}
}
class Lab337{
public static void main(String as[]){
Hello h=new Hello();
boolean x=h.isEven(10);
System.out.println(x);
}
}