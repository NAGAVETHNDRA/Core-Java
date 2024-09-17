class customer{
int cid;
String cname;
String email;
long phone;

customer(){
}
customer(int cid,String cname,String email,long phone){
this.cid=cid;
this.cname=cname;
this.email=email;
this.phone=phone;
}
public boolean equals(Object obj){
customer cust=(customer)obj;
boolean b1=this.cid==cust.cid;
boolean b2=this.cname.equals(cust.cname);
boolean b3=this.email.equals(cust.email);
boolean b4=this.phone==cust.phone;
boolean b= b1 && b2 && b3 && b4;
return b;
}
}
class Lab524{
public static void main(String as[]){
customer cust1=new customer(571,"chinna","chinna@gmail.com",758654634);
customer cust2=new customer(571,"chinna","chinna@gmail.com",758654634);
customer cust3=new customer(572,"kanna","kanna@gmail.com",78754634);

System.out.println(cust1.equals(cust2));
System.out.println(cust1.equals(cust3));
}
}

