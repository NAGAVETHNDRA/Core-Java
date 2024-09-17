class Hai{
Hai(int a){
System.out.println("Hai-1 arg con");
}
}
class Hello extends Hai {
Hello(){
super(10);
System.out.println("Hello-0 arg con");
}
}

class Lab413{
public static void main(String args[]){
new Hello();
}
}
