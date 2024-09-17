class Course{

public final static Course JAVA = new Course(101,200);
public final static Course SPRING = new Course(102,300);
public final static Course  DSA = new Course(103,400);
public final static Course REACT = new Course(104,600);
public final static Course PYTHON = new Course(105,600);

int cid;
double price;
private Course (int cid,double price){
this.price= price;
this.cid=cid;
}

public int getCid(){
return cid;
}

public double getPrice(){
return price;
}

public String toString(){
return "Course["+cid+"]";
}
}

class Lab830{

public static void main(String ar[]){

Course cou1  = Course.JAVA;
Course cou2 = Course.SPRING;
Course cou3 = Course.DSA;
Course cou4 = Course.REACT;
Course cou5 = Course.PYTHON;

System.out.println(cou1);
System.out.println(cou1);
System.out.println(cou2);
System.out.println(cou3);
System.out.println(cou4);
System.out.println(cou5);


Course mycou=Course.DSA; 
int cid = mycou.getCid(); 
double price = mycou.getPrice(); 
System.out.println(cid); 
System.out.println(price); 

}
}