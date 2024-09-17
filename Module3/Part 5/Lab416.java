class A{
A(){
System.out.println("A-0 arg con");
}
}
class B extends A{
B(){
System.out.println("B-0 arg con");
}
B(int a){
this();
System.out.println("B-1 arg con");
}
}
class Lab416{
public static void main(String args[]){
new B(10);
}
}
