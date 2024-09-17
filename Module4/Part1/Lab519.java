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
public String toString(){
String str="["+cid+","+cname+","+email+","+phone+"]";
return str;
}
}
class Lab519{
public static void main(String as[]){
customer cust1=new customer();
System.out.println(cust1);

customer cust2=new customer(571,"chinna","chinna@gmail.com",758654634);
System.out.println(cust2);
}
}

