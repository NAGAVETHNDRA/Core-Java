
class A {
static
{
System.out.println("A-S.B");
}
{
System.out.println("A-I.B");
}
}
class B extends A {
static 
{
System.out.println("B-S.B");
}
{
System.out.println("B-I.B");
}
}
class C extends B {
static
{
System.out.println("C-S.B");
}
{
System.out.println("C-I.B");
}
}

class Lab403{
public static void main(String args[]){
C co=new C();
}
}
