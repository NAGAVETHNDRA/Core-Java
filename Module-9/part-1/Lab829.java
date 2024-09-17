class Course{

public final static Course JAVA = new Course(101);
public final static Course SPRING = new Course(102);
public final static Course  DSA = new Course(103);
public final static Course REACT = new Course(104);
public final static Course PYTHON = new Course(105);

int cid;
private Course (int cid){

this.cid=cid;
}
public String toString(){
return "Course["+cid+"]";
}
}

class Lab829{

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
}
}