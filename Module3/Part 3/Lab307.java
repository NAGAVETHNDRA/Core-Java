class Hello{
Hello(){
this(10);
System.out.println("Hello-0 arg");
}
Hello(int a){
this();
System.out.println("Hello-1 arg");
}

}
class Lab307{
public static void main(String as[]){
Hello h=new Hello(99);


}
}