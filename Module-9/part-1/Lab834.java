
enum Course{ 

JAVA(101,5000), 
SPRING(210,6000), 
DSA(301,9000), 
REACT(401,7000), 
PYTHON; 

private int cid; 
private double price; 

private Course(){ 
System.out.println("Course-D.C"); 
} 


private Course(int cid,double price){ 
System.out.println("Course-2 arg"); 
this.cid=cid; 
this.price=price; 
} 


public int getCid(){ 
return cid; 
} 


public double getPrice(){ 
return price; 
} 


public String toString(){ 
return "Course["+cid+","+name()+","+price+"]"; 
} 
}


class Lab834{ 
public static void main(String args[]) { 


System.out.println("Hello Guys"); 
Course mycou=Course.DSA; 


System.out.println("["+mycou.getCid()+","+mycou.name()+","+mycou.getPrice()+"]"); 
Course c1= Course.JAVA; 
Course c2= Course.DSA; 
Course c3= Course.JAVA; 


System.out.println(c1.compareTo(c2)); 
System.out.println(c1.compareTo(c3)); 
System.out.println(c2.compareTo(c3)); 

System.out.println("------------"); 

System.out.println(c1.equals(c2)); 
System.out.println(c1.equals(c3)); 
System.out.println(c2.equals(c3)); 

System.out.println("------------"); 

System.out.println(c1==c2); 
System.out.println(c1==c3); 
System.out.println(c2==c3); 
} 
} 