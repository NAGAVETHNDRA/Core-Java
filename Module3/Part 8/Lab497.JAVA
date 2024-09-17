interface inter{
int A=10;
static void show(){

System.out.println("inter-show");
System.out.println(A);
}
}
class Lab497{
public static void main(String as[]){
inter.show();
}
}