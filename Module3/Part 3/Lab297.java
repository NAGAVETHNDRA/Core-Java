class Customer{
int cid;
String cname;
String email;
long phone;
String city;

Customer(){
System.out.println("0 org-con");
}

Customer(int cid,String cname,String email){
System.out.println("3 org-con");
this.cid=cid;
this.cname=cname;
this.email=email;
}


Customer(int cid,String cname,String email,long phone){
System.out.println("4 org-con");
this.cid=cid;
this.cname=cname;
this.email=email;
this.phone=phone;
}

Customer(int cid,String cname,String email,long phone,String city){
System.out.println("5 org-con");
this.cid=cid;
this.cname=cname;
this.email=email;
this.phone=phone;
this.city=city;
}
void show(){
System.out.println(cid+"\t"+cname+"\t"+email+"\t"+phone+"\t"+city);

}
}
class Lab297{
public static void main(String as[]){
Customer cust1=new Customer();
cust1.show();

Customer cust2=new Customer(571,"chinna","chinna@gmail.com");
cust2.show();

Customer cust3=new Customer(571,"chinna","chinna@gmail.com",999999);
cust3.show();

Customer cust4=new Customer(571,"chinna","chinna@gmail.com",999999,"vijayawada");
cust4.show();


}}


