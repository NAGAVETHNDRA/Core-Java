
enum Course{ 

JAVA(101), 
SPRING(210), 
DSA(301), 
REACT(401),
PYTHON(501); 


private int cid; 



Course(int cid){ 
System.out.println("Course-Con"); 
this.cid = cid;
} 



public int getCid(){ 
return cid; 
} 



public String toString(){ 
return "Course["+cid+","+name()+"]"; 
} 
}


class Lab837{ 
public static void main(String args[]) { 


} 
} 