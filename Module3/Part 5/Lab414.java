class Hai{
Hai(int a){
System.out.println("Hai-1 arg con");
}
}
class Hello extends Hai {
Hello(){
System.out.println("Hello-0 arg con");
super(10);
}
}

class Lab414{
public static void main(String args[]){
new Hello();
}
}
