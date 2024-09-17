import java.util.*; 
class Lab806 { 
public static void main(String args[]) { 
Date mydate = new Date(); 
System.out.println(mydate); 
System.out.println("Date : " + mydate.getDate()); 
System.out.println("Month : " + mydate.getMonth()); 
System.out.println("Month : " + (mydate.getMonth() + 1)); 
System.out.println("Year : " + mydate.getYear()); 
System.out.println("Year : " + (mydate.getYear() + 1900)); 
System.out.println("Hours : " + mydate.getHours()); 
System.out.println("Minutes : " + mydate.getMinutes()); 
System.out.println("Seconds : " + mydate.getSeconds()); 
System.out.println("\nUpdate the 
Date"); 
mydate.setDate(25); 
mydate.setMonth(0); 
mydate.setYear(121); 
System.out.println(mydate); 
} 
}
