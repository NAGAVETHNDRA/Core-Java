class Hello{
int a;


Hello(){
System.out.println("Hello-0 arg");
this(10);
}
Hello(int a){
System.out.println("Hello-1 arg");
this.a=a;

}

}
class Lab308{
public static void main(String as[]){
Hello h=new Hello();


}
}