class Hai{
int a=99;
}
class Hello{
Hai hai new Hai();
int x=10;

void m1(){
Hai hai1=new Hai();
Hai hai2=new Hai();
Hai hai3=new Hai();
}
void show(){
System.out.println("Hello show()");
}
public void finalize(){
System.out.println("Hello finalize()");
//this.hai=null;
}
}
class Lab526{

public static void main(String as[]){
new Hello().show();
Hello h=new Hello();
h=null;
Hello h1=new Hello();
Hello h2=new Hello();
h1=h2;
new Hello().m1();
System.runFinalize();
System.gc();
}
}

