
class B {
B(){
this(10);
System.out.println("B-0 arg con");
}
B(int a){
this();
System.out.println("B-1 arg con");
}
}
class Lab417{
public static void main(String args[]){
new B(10);
}
}
