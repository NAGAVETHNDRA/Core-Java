class outer {
int a=10;
class inner{
int a=99;
void show(){
System.out.println("inner-show()");
int a=20;
System.out.println(a);
System.out.println(this.a);
System.out.println(inner.this.a);
//System.out.println(super.a);
System.out.println(outer.this.a);

}
}
}
class Lab502{
public static void main(String as[]){
outer.inner myinner=new outer().new inner();
myinner.show();
}
}

