class Lab191{
public static void main(String as[]){
MyJlc:
for(int i=1;i<=3;i++){
for(int j=1;j<=2;j++){
System.out.println(i+"\t"+j);
if(i==2)
continue MyJlc ;
System.out.println("Hello Guys");
}
}
}
}