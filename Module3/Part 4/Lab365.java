class Hello{
void printNums(int n){
if(n==0)
return;
System.out.println(n);
printNums(n-1);
}
}
class Lab365{
public static void main(String as[]){
Hello h=new Hello();
h.printNums(5);
}
}