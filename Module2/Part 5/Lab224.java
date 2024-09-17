class Lab224{
public static void main(String as[]){
int arr[]={10,20,30,40,50};
System.out.println("1.Print all from 1st element");
for(int i=0;i<arr.length;i++)
System.out.println(arr[i]);

System.out.println("1.Print all from 3rd element");
for(int i=2;i<arr.length;i++)
System.out.println(arr[i]);

System.out.println("3.Print all from odd elements");
for(int i=1;i<arr.length;i=i+2)
System.out.println(arr[i]);

System.out.println("4.Print all reverse order ");
for(int i=arr.length-1;i>0;i--)
System.out.println(arr[i]);


}
}