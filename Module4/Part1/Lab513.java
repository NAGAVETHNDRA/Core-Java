package com.myjlc;
class Hai {}
class Hello extends Hai{
void show(){
System.out.println("Hello-show");
}
}
class Lab513{
public static void main(String as[]){
Hello h=new Hello();
h.show();
Class myclass=h.getClass();
System.out.println(myclass.getName());
System.out.println(myclass.getSuperclass());
System.out.println(myclass.getPackage());

}
}
