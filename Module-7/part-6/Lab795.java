import java.util.*; 
class IntegerComparator implements 
Comparator<Integer>{ 
public int compare(Integer i1,Integer i2){ 
return i1-i2; 
} 
} 
class Lab795{ 
public static void main(String args[]) { 
Integer myarr[]= {30,50,20,60,10,40}; 
System.out.println(Arrays.toString(myarr)); 
Arrays.sort(myarr,new IntegerComparator()); 
System.out.println(Arrays.toString(myarr)); 
Arrays.sort(myarr,new 
IntegerComparator().reversed()); 
System.out.println(Arrays.toString(myarr)); 
} 
} 
