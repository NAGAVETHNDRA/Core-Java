class Lab200{
public static void main(String as[]){

int arr[]=new int[5];
int n=arr.length;
for(int i=0;i<n;i++){
System.out.println(arr[i]);
}
arr[0]=10;
arr[1]=20;
arr[2]=30;
arr[3]=40;
arr[4]=50;
for(int i=0;i<n;i++){
System.out.println(arr[i]);
}

}
}