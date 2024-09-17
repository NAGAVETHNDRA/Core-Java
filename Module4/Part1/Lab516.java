class Hello{
int a;
int b;
Hello(int a,int b){
this.a=a;
this.b=b;
}
void show(){
System.out.println("{a="+a+",b="+b+"}");
}
}
class Lab516{
public static void main(String as[]){
Hello hello1=null;
//hello1.show();
System.out.println(hello1);

Hello hello2=new Hello(55,66);
hello2.show();
System.out.println(hello2);
System.out.println(hello2.toString());

}
}

