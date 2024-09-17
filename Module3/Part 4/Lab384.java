
class Lab384{

public static void main(String args[]){
System.out.println("I am main(String[])");
main("MY JLC");
main(new int[]{10,20,30});
}
public static void main(String args){
System.out.println("I am main(String)");
}
public static int main(int [] args){
System.out.println("I am main(int[])");
return 99;
}

}
