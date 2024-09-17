import java.util.*; 
class Lab794{ 
public static void main(String args[]) { 
int myarr[]= {30,50,80,70,10,40,20,60}; 
System.out.println(Arrays.toString(myarr)); 
Arrays.sort(myarr); 
System.out.println(Arrays.toString(myarr)); 
//Arrays.sort(myarr,0,6); 
//System.out.println(Arrays.toString(myarr)); 
int x = Arrays.binarySearch(myarr,50); 
System.out.println(x); 
int y = Arrays.binarySearch(myarr,99); 
System.out.println(y); 
Arrays.fill(myarr,-1); 
System.out.println(Arrays.toString(myarr)); 
} 
} 
