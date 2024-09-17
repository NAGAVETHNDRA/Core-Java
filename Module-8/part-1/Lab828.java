import java.io.*; 
class Customer implements Externalizable{ 
int cid; 
String cname; 
String email; 
long phone; 
String username; 
String password; 
public Customer(){} 
Customer(int cid,String cname,String email,long phone,String username,String password){ 
this.cid=cid; 
this.cname=cname; 
this.email=email; 
this.phone=phone; 
this.username=username; 
this.password=password; 
} 
public String toString(){ 
return "["+cid+","+cname+","+email+","+phone+","+username+","+password+"]"; 
} 
public void writeExternal(ObjectOutput myoutput) throws IOException { 
myoutput.writeInt(this.cid+100); 
myoutput.writeObject(this.cname); 
myoutput.writeObject(this.email); 
myoutput.writeLong(this.phone); 
} 
public void readExternal(ObjectInput myinput) throws IOException, 
ClassNotFoundException{ 
this.cid= myinput.readInt()-100; 
this.cname= myinput.readObject().toString(); 
this.email= myinput.readObject().toString(); 
this.phone= myinput.readLong(); 
} 
}
class Lab828{ 
public static void main(String args[]) throws IOException { 
//serializeCustomer(); 
deserializeCustomer(); 
} 
static void serializeCustomer() throws IOException{ 
ObjectOutputStream oos= null; 
FileOutputStream fos= null; 
try{ 
fos= new FileOutputStream("mycustomers3.txt"); 
oos= new ObjectOutputStream(fos); 
Customer mycust= new Customer(101,"sri","sri@jlc",12345,"sri123","sri123"); 
oos.writeObject(mycust); 
System.out.println(" Object is Serialized !!! "); 
}catch(Exception ex){ 
System.err.println("ooooooops!!"+ex); 
}finally{ 
if(fos!=null) 
fos.close(); 
if(oos!=null) 
oos.close(); 
} 
} 
static void deserializeCustomer() throws IOException{ 
ObjectInputStream ois= null; 
FileInputStream fis= null; 
try{ 
fis= new FileInputStream("mycustomers3.txt"); 
ois= new ObjectInputStream(fis);
Object obj = ois.readObject(); 
Customer mycust= (Customer) obj; 
System.err.println("here the customer=> "+mycust); 
System.err.println(" Object is De--Serialized !!! "); 
}catch(Exception ex){ 
System.err.println("ooooooops!!"+ex); 
}finally{ 
if(fis!=null) 
fis.close(); 
if(ois!=null) 
ois.close(); 
} 
} 
}