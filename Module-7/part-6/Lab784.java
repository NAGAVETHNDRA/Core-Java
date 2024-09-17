

import java.util.*;

class Customer implements Comparable<Customer>{
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
	
	public int compareTo(Customer cust) {
		//int x = cust.cid - this.cid;
		int x = this.cid-cust.cid;
		return x;
	}
}
	class CidComparator implements Comparator<Customer>{

		@Override
		public int compare(Customer cust1, Customer cust2) {
			int x = cust1.cid-cust2.cid;
			return x;
		}
	}
	
	class CnameCompartor implements Comparator<Customer>{
		public int compare(Customer cust1,Customer cust2) {
			int x = cust1.cname.compareTo(cust2.cname);
			return x;
		}
	}
	
	class emailCompator implements Comparator<Customer>{

		@Override
		public int compare(Customer cust1, Customer cust2) {
			int x = cust1.email.compareTo(cust2.email);
			return x;
		}
	}
	class PhoneCompartor implements Comparator<Customer>{

		@Override
		public int compare(Customer cust1, Customer cust2) {
			int x = (int)(cust1.phone-cust2.phone);
			return x;
		}
		
	}
	

class Lab784{ 

public static void main(String args[]) { 
	Customer cust3 = new Customer(103 ,"aaa","aai@.com",333);
	Customer cust4 = new Customer(104 ,"bbb","bbi@.com",444);
	Customer cust1 = new Customer(101 ,"ccc","cci@.com",111);
	Customer cust2 = new Customer(102 ,"ddd","ddi@.com",222);
	Customer cust5 = new Customer(105 ,"eee","eei@.com",555);

	//Set<Customer> myset = new TreeSet<>();
	
	//Set<Customer> myset = new TreeSet<>( new CnameCompartor());
	//Set<Customer> myset = new TreeSet<>( new CidCompartor());
	//Set<Customer> myset = new TreeSet<>( new emailCompator());
	//Set<Customer> myset = new TreeSet<>( new CidComparator());
	Set<Customer> myset = new TreeSet<>( new PhoneCompartor());
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

