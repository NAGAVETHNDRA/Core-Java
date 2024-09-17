class Lab189{
public static void main(String as[]){
MyJlc:
for(int i=1;i<=5;i++){
for(int j=1;j<=5;j++){
System.out.println("Hello Guys");
if(i==4)
break MyJlc;
System.out.println(i+"\t"+j);
}
}
}
}