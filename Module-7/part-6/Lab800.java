import java.util.*; 
class Lab800{ 
public static void main(String args[]) { 
String str="Hello Guys* How are you?"; 
StringTokenizer mytokens = new 
StringTokenizer(str,"*"); 
System.out.println("Count : "+ 
mytokens.countTokens()); 
while(mytokens.hasMoreTokens()){ 
String token = mytokens.nextToken(); 
System.out.println(token); 
} 
} 
} 