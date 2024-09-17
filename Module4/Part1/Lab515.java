class Hello{
int a;
Hello(int a){
this.a=a;
}
void show(){
System.out.println("Hello-show:"+a);
}
public int hashCode(){
return a*25;
}
}
class Lab515{
public static void main(String as[]){
Hello hello1=new Hello(100);
hello1.show();
Hello hello2=new Hello(200);
hello2.show();

int hash1=hello1.hashCode();
System.out.println(hash1);
int hash2=hello2.hashCode();
System.out.println(hash2);

}
}

