class Hello{
int a=10;
static int b=20;

int m1(int x){
int p=30;
int q=p+x;
return q;
}
void show(){
int d=m1(20);
System.out.println(d);
}
}


class Test{

public static void main(String as[]){
Hello h=new Hello();
h.show();
int hash=h.hashCode();
System.out.println(hash);

}
}

