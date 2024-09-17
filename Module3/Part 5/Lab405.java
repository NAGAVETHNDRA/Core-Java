
class A {
A(){
System.out.println("A.C");
}
}
class B extends A{
B(){
System.out.println("B.C");
}
}
class C extends B{
C(){
System.out.println("C.C");
}
}

class Lab405{
public static void main(String args[]){
new C();
}
}
