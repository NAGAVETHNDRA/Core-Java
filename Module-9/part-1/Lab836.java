
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


class Lab836{ 
public static void main(String args[]) { 


// Course mycou = Course.DSA;
Course mycou = Course.DSA;

switch(mycou){

case SPRING:
	System.out.println("Spring course info");
	System.out.println(Course.SPRING);
	break;
case DSA:
	System.out.println("dsa course info");
	System.out.println(Course.DSA);
	break;
case JAVA:
	System.out.println("java course info");
	System.out.println(Course.JAVA);
	break;


}
} 
} 