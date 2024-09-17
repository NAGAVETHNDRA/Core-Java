
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
public class Lab764{
	
	
public static void main(String ar[]){
	Customer cust1 = new Customer(101,"sri","sri@myjlc",123);
	
	Customer cust2 = new Customer(101,"sri","venky@myjlc",123);
	Customer cust3 = new Customer(101,"sri","vk@myjlc",123);
	
	Map <Integer,Customer> mymap = new HashMap<>();
	//Map <Integer,Customer> mymap = new TreeMap<>();
	//Map <Integer,Customer> mymap = new LinkedHashMap<>();
	
	mymap.put(103, cust3);
	mymap.put(101, cust2);
	mymap.put(102, cust1);
	
	System.out.println(mymap);
	
	Set<Integer> mykeys = mymap.keySet();
	System.out.println("using for lopp");
	
	for(Integer key : mykeys) {
		System.out.println(key);
		
	}
	}

}