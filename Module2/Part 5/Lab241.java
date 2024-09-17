class Lab241{
public static void main(String as[]){

int temp[]={11,22,33,44,55};

int arr[][]=new int[3][];

arr[0]=new int[6];
arr[1]=new int[]{10,20,30};
arr[2]=temp;

for(int []x:arr){
 for(int y:x){
System.out.println(y);
}
}
}
}