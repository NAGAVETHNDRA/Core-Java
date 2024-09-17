enum Course{

JAVA,
SPRING,
DSA,
REACT,
PYTHON;
private Course(){
System.out.println("course-dc");


}
}

class Lab831{

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