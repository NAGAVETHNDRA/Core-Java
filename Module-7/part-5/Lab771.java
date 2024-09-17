

import java.util.*;
class A{
public String toString(){
return " I am A";
}
}

class B extends A {
public String toString (){
return "I am B";
}
}

class C extends B {
public String toString(){
return "I am C";
}
}

class D extends C {
public String toString(){
return "I am D";
}
}

class Lab771{ 
public static void show(List<? extends A> mylist){ 
for(A ao : mylist){ 
System.out.println(ao); 
} 
} 
public static void main(String args[]) { 
List<A> mylist1 = new ArrayList<>(); 
mylist1.add(new A()); 
mylist1.add(new A()); 
mylist1.add(new A()); 
System.out.println("List of A's"); 
show(mylist1); 
List<B> mylist2 = new ArrayList<>(); 
mylist2.add(new B()); 
mylist2.add(new B()); 
mylist2.add(new B()); 
System.out.println("List of B's"); 
show(mylist2); 
List<C> mylist3 = new ArrayList<>(); 
mylist3.add(new C()); 
mylist3.add(new C()); 
mylist3.add(new C()); 
System.out.println("List of C's"); 
show(mylist3); 
List<D> mylist4 = new ArrayList<>(); 
mylist4.add(new D()); 
mylist4.add(new D()); 
mylist4.add(new D()); 
System.out.println("List of D's"); 
show(mylist4); 
} 
} 

