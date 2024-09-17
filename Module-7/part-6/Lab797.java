import java.util.*; 
class Lab797{ 
public static void main(String args[]) { 
String myarr[]= 
{"hello","spring","angular","java","dandes"}; 
System.out.println(Arrays.toString(myarr)); 
Arrays.sort(myarr); 
System.out.println(Arrays.toString(myarr)); 
List<String> mylist = Arrays.asList(myarr); 
System.out.println(mylist); 
String str[] = Arrays.copyOf(myarr,3); 
System.out.println(Arrays.toString(str)); 
} 
}