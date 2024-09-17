class Lab525{
public static void main(String as[]){
//Runtime rt=new Runtime();

Runtime rt=Runtime.getRuntime();

System.out.println(rt.maxMemory());
System.out.println(rt.totalMemory());
System.out.println(rt.freeMemory());

}
}

