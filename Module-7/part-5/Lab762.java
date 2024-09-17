
import java.util.*;

class Customer{
	int cid;
	String cname;
	String email;
	long phone;
	public Customer() {
		
	}
	public Customer (int cid, String cname,String email,long phone) {
		this.cid = cid;
		this.cname = cname;
		this.email= email;
		this.phone = phone;
		
	}
	
	public String toString() {
		return "("+cid+","+cname+","+email+","+phone+")"; 
	}
	
	public int compareTo(Customer cust) {
		return this.cid - cust.cid;
	}
}
public class Lab762{
	
	
public static void main(String ar[]){
	Customer cust1 = new Customer(101,"sri","sri@myjlc",123);
	
	Customer cust2 = new Customer(102,"sri","venky@myjlc",123);
	Customer cust3 = new Customer(103,"sri","vk@myjlc",123);
	//List<Customer> mylist = new ArrayList<>();
	//Set<Customer> mylist = new HashSet<Customer>();
	Set<Customer> mylist = new LinkedHashSet<Customer>();
	//Set<Customer> mylist = new TreeSet<Customer>();
	
	mylist.add(cust1);
	mylist.add(cust2);
	mylist.add(cust3);
	System.out.println(mylist);
	System.out.println("using iterator");
	Iterator <Customer> it = mylist.iterator();
	while(it.hasNext()) {
		Customer  cust = it.next();
		System.out.println(cust);
	}
	}

}