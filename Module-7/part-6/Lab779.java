

import java.util.*;

class Customer implements Comparable{
	int cid;
	String cname;
	String email;
	long phone;
	
	Customer(){}
	
	Customer(int cid, String cname,String email,long phone){
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone  = phone;
		
	}
	
	public String toString() {
		return "["+cid+"\t"+cname+"\t"+email+"\t"+phone+"]"; 
	}
	
	public int compareTo(Object obj) {
		Customer cust = (Customer)obj;
		int x =this.cid - cust.cid;
		return x;
	}
}

class Lab779{ 

public static void main(String args[]) { 
	Customer cust3 = new Customer(103 ,"sri","sri@.com",333);
	Customer cust4 = new Customer(104 ,"sri","sri@.com",444);
	Customer cust1 = new Customer(101 ,"sri","sri@.com",111);
	Customer cust2 = new Customer(102 ,"sri","sri@.com",222);
	Customer cust5 = new Customer(105 ,"sri","sri@.com",555);

	Set<Customer> myset = new TreeSet<>();
	myset.add(cust5);
	myset.add(cust1);
	myset.add(cust3);
	myset.add(cust2);
	myset.add(cust4);
	
	for(Customer cust : myset) {
		System.out.println(cust);
	}
} 
} 

