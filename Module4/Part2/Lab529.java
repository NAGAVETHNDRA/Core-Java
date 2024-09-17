class Lab529{
public static void main(String as[]){
String str1=new String("JlC");
String str2=new String("JlC");
String str3="JLC";
System.out.println(str1==str3);
System.out.println(str2==str3);
str1=str1.intern();
str2=str2.intern();
System.out.println(str1==str3);
System.out.println(str2==str3);

}
}

