package com.myjlcindia.part8; 
import java.text.ParseException; 
import java.text.SimpleDateFormat; 
import java.util.Date; 
class Lab809 { 
public static void main(String[] args) throws ParseException { 
SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd"); 
String result1 = dateFormat1.format(new Date()); 
System.out.println(result1); 
SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
String result2 = dateFormat2.format(new Date()); 
System.out.println(result2); 
SimpleDateFormat dateFormat3 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss"); 
String result3 = dateFormat3.format(new Date()); 
System.out.println(result3); 
Date mydate = dateFormat1.parse("2024-06-16"); 
System.out.println(mydate); 
} 
}