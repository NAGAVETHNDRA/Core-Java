
import java.util.*;

class Student{
	int sid;
	String sname;
	String email;
	long phone;
	
	public Student() {
		
	}
	
	public Student(int sid, String sname, String email, long phone) {
	this.sid = sid;
	this.sname = sname;
	this.email = email;
	this.phone = phone;
			
	}
	
	public String toString() {
		return sid+"\t"+sname+"\t"+email+"\t"+phone; 
	}
}
public class Lab766{
public static void main(String ar[]){
	Student stu1 = new Student(101,"venky","venky@.com",123);
	Student stu2 = new Student(102,"venky","venky@.com",134);
	Student stu3 = new Student(103,"venky","venky@.com",198);
	
	List<Student> mylist1 = new ArrayList<>();
	mylist1.add(stu1);
	mylist1.add(stu2);
	mylist1.add(stu3);
	
	Student stu4 = new Student(201,"venky","venky@.com",123);
	Student stu5 = new Student(202,"venky","venky@.com",123);
	
	List<Student> mylist2 = new ArrayList<>();
	mylist2.add(stu4);
	mylist2.add(stu5);
	
	Map<String,List<Student>> javaBatches = new TreeMap<>();
	javaBatches.put("B-2",mylist2);
	javaBatches.put("B-1",mylist1);
	
	Map<String,List<Student>> awsBatches = new TreeMap<>();
	awsBatches.put("B-2",mylist2);
	awsBatches.put("B-1",mylist1);
	
	Map<String,List<Student>> webBatches = new TreeMap<>();
	 webBatches.put("B-2",mylist2);
	 webBatches.put("B-1",mylist1);
	
	 Map<String,Map<String,List<Student>>>  jlc = new TreeMap<>();
	 
	 jlc.put("java", javaBatches);
	 jlc.put("aws", awsBatches);
	 jlc.put("web", webBatches);
	 
	 Set <String> mycourse = jlc.keySet();
	 
	 System.out.println(mycourse);
	 
	 for(String mycou : mycourse) {
		 System.out.println("\n"+ mycourse + " Batch Details");
		 Map<String,List<Student>> batchMap = jlc.get(mycou);
		 Set<String> mybatchs = batchMap.keySet();
		 for(String mybatch : mybatchs) {
			 System.out.println("\n"+mybatch+"Student details:");
			 List<Student> stuList = batchMap.get(mybatch);
			 for(Student mystudent : stuList) {
				 System.out.println(mystudent);
			 }
		 }
		 
	 }
	 

	
	
	}
}