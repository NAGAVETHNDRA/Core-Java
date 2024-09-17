import java.util.*; 
class Lab798{ 
public static void main(String args[]) { 
int myarr[][]= {{10,20,30},{40,50,60},{70,80,90}}; 
System.out.println(Arrays.toString(myarr)); 
for(int x[]:myarr){ 
System.out.println(Arrays.toString(x)); 
} 
System.out.println(Arrays.deepToString(myarr)); 
} 
} 