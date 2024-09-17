
import java.io.*;

class Customer implements Serializable{
	int cid;
	String cname;
	String email;
	long phone;
	
	Customer(){
		
	}
	Customer(int cid,String cname,String email,long phone){
		this.cid= cid;
		this.cname= cname;
		this.email= email;
		this.phone= phone;
		
	}
	
	public String toString() {
		return  "["+cid+","+cname+","+email+","+phone+"]"; 
	}
}
 class Lab825 {

	public static void main(String[] args) throws IOException{
		//serializeCustomer();
		deserializeCustomer();
		
	}
	static void serializeCustomer() throws IOException {
		
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("cust.txt");
			oos = new ObjectOutputStream(fos);
			
			Customer mycust = new Customer(101,"venky","vek@gmail.com", 1233455);
			oos.writeObject(mycust);
			System.err.println("object is Serialized..");
			
		}catch(Exception ex) {
			System.err.println("ooopps"+ex);
		}finally {
			if(fos!=null)
				fos.close();
			if(oos!=null)
				oos.close();
			
		}
				
	}
	
	
	static void deserializeCustomer() throws IOException{
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("cust.txt");
			ois = new ObjectInputStream(fis);
			
			Object obj = ois.readObject();
			Customer mycust = (Customer)obj;
			System.err.println("here the Customer =>"+mycust);
			System.out.println("Object is deserialized...");
		}catch(Exception ex) {
			System.err.println("ooops "+ex);
		}
		finally {
			if(fis!=null)
				fis.close();
			if(ois!=null)
				ois.close();
		}
		
			
	}
	
	
}

