enum Course{

JAVA,
SPRING,
DSA,
REACT,
PYTHON;

private int cid;
private Course(){
System.out.println("course-dc");
}
private Course(int cid){
System.out.println("course - 1.arg");
this.cid = cid;

}

public int getCid(){
return cid;

}
}

class Lab832{

public static void main(String ar[]){

Course cou1  = Course.JAVA;
Course cou2 = Course.SPRING;
Course cou3 = Course.DSA;
Course cou4 = Course.REACT;
Course cou5 = Course.PYTHON;

System.out.println(cou1.ordinal()+"\t"+cou1.name()+"\t"+cou1.getCid());
System.out.println(cou2.ordinal()+"\t"+cou2.name()+"\t"+cou2.getCid());
System.out.println(cou3.ordinal()+"\t"+cou3.name()+"\t"+cou3.getCid());
System.out.println(cou4.ordinal()+"\t"+cou4.name()+"\t"+cou4.getCid());
System.out.println(cou5.ordinal()+"\t"+cou5.name()+"\t"+cou5.getCid());



}
}