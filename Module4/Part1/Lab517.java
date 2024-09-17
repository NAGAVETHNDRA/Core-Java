class Hello{
int a;
int b;
Hello(int a,int b){
this.a=a;
this.b=b;
}
public int hashCode(){
return a+b;
}
}
class Lab517{
public static void main(String as[]){
Hello hello1=null;
System.out.println(hello1);

Hello hello2=new Hello(10,20);
System.out.println(hello2);
System.out.println(hello2.toString());
System.out.println(hello2.hashCode());


}
}

