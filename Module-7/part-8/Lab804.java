import java.util.*; 
class Lab804{ 
public static void main(String args[]) { 
Formatter fmt = new Formatter(); 
int a=10; 
int b=20; 
int sum=a+b; 
fmt.format("Sum of %d and %d is %d",a,b,sum); 
System.out.println(fmt.toString()); 
fmt.close(); 
} 
} 