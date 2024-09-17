import java.util.*; 
class Lab803{ 
public static void main(String args[]) { 
String str="Hello Guys, How are you?"; 
Scanner myscanner1 = new 
Scanner(str);//delimiter - space 
while(myscanner1.hasNext()){ 
String x = myscanner1.next(); 
System.out.println(x); 
} 
String mystr="Hello Guys. I am Srinivas. I am 
studying at JLC"; 
Scanner myscanner2 = new Scanner(mystr); 
myscanner2 = myscanner2.useDelimiter("\\."); 
//delimiter - dot 
while(myscanner2.hasNext()){ 
String x = myscanner2.next(); 
System.out.println(x); 
} 
} 
} 