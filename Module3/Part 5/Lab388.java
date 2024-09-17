class Hai{
static{
System.out.println("Hai-S.B");
}
}
class Hello extends Hai{
static{
System.out.println("Hello -S.B");
}
}

class Lab388{
public static void main(String args[]){
Hello hello=new Hello();
}
}
