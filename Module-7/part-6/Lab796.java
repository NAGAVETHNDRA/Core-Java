import java.util.*; 
class Lab796{ 
public static void main(String args[]) { 
int myarr1[]= {30,50,20,60,10,40}; 
int myarr2[]= {35,55,25,60,10,40}; 
int myarr3[]= {30,50,20,60,10,40}; 
System.out.println(Arrays.toString(myarr1)); 
System.out.println(Arrays.toString(myarr2)); 
System.out.println(Arrays.toString(myarr3)); 
boolean x= Arrays.equals(myarr1,myarr2); 
System.out.println(x); 
boolean y= Arrays.equals(myarr2,myarr3); 
System.out.println(y); 
boolean z= Arrays.equals(myarr1,myarr3); 
System.out.println(z); 
} 
}