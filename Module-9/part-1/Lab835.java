
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


class Lab835{ 
public static void main(String args[]) { 


System.out.println("Hello Guys"); 
Course mycou=Course.DSA; 


System.out.println("["+mycou.getCid()+","+mycou.name()+","+mycou.getPrice()+"]"); 

Course mycourses[] = Course.values();
for(Course mycourse : mycourses){
System.out.println(mycourse);

}

System.out.println("=============");

Course cou = Course.valueOf("JAVA");
System.out.println(cou);

System.out.println(Course.valueOf("DSA"));
//Course x = Course.valueOf("DEVOPS");

} 
} 