import java.util.*; 
class Lab808 { 
 public static void main(String args[]) { 
 Calendar today = Calendar.getInstance(); 
 Calendar nextDate = Calendar.getInstance(); 
 Calendar today1 = Calendar.getInstance(); 
 nextDate.set(Calendar.DATE, 23); 
 nextDate.set(Calendar.MONTH, 2); 
 nextDate.set(Calendar.YEAR, 2024); 
 System.out.println(today.getTime()); 
 System.out.println(nextDate.getTime()); 
 System.out.println("AFTER TODAY:" + today.after(nextDate)); 
 System.out.println("BEFORE TODAY:" + today.before(nextDate)); 
 System.out.println("compareTo:" + today.compareTo(nextDate)); 
 System.out.println("compareTo:" + today.compareTo(today)); 
 System.out.println("compareTo:" + today.compareTo(today1)); 
 System.out.println("compareTo:" + nextDate.compareTo(today)); 
 } 
} 