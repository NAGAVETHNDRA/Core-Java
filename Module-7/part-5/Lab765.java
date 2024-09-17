
import java.util.*;

class Customer implements Comparable<Customer>{
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
public class Lab765{
	
	
public static void main(String ar[]){
	Customer cust1 = new Customer(101,"sri","sri@myjlc",123);
	
	Customer cust2 = new Customer(102,"sri","venky@myjlc",123);
	Customer cust3 = new Customer(103,"sri","vk@myjlc",123);
	
	//Map <Integer,Customer> mymap = new HashMap<>();
	//Map <Integer,Customer> mymap = new TreeMap<>();
	//Map <Integer,Customer> mymap = new LinkedHashMap<>();
	
	//Map<Customer,Integer> mymap = new HashMap<>();
	//Map<Customer,Integer> mymap = new LinkedHashMap<>();
	Map<Customer,Integer> mymap = new TreeMap<>();
	
	mymap.put(cust3, 103);
	mymap.put(cust1, 101);
	mymap.put(cust2, 102);
	
	System.out.println(mymap);
	
	Set<Customer> mykeys = mymap.keySet();
	System.out.println("using for lopp");
	
	for(Customer key : mykeys) {
		System.out.println(key);
		
	}
	}

}