class Hello{
void printNums(int n){
if(n==0)
return;
printNums(n-1);
System.out.println(n);
}
}
class Lab366{
public static void main(String as[]){
Hello h=new Hello();
h.printNums(5);
}
}