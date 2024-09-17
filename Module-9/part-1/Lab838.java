import java.util.*;
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


class Lab838{ 
public static void main(String args[]) { 

System.out.println("----------------------");
Set<Course> myset1= EnumSet.allOf(Course.class);
for(Course mycourse : myset1){
System.out.println(mycourse);
}

System.out.println("----------------------");
Set<Course> myset2= EnumSet.range(Course.SPRING,Course.REACT);
for(Course mycourse : myset2){
System.out.println(mycourse);
}

System.out.println("----------------------");
Map<Course,Integer> mymap= new EnumMap<>(Course.class);
System.out.println(mymap);
mymap.put(Course.JAVA,0);
mymap.put(Course.SPRING,1);
mymap.put(Course.DSA,2);

System.out.println(mymap);

} 
} 