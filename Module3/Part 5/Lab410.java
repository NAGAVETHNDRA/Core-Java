
class Hello {
void m1(){
System.out.println("Hello-m1()");
}
void show(){
System.out.println("Hello-show()-begin");
m1();
this.m1();
System.out.println("Hello-show()-end");
}
}

class Lab410{
public static void main(String args[]){
Hello hello=new Hello();
hello.show();
}
}
