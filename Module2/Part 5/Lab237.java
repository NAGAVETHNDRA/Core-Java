class Lab237{
public static void main(String as[]){
int arr[][]=new int[3][3];

arr[0][0]=10;
arr[0][1]=20;
arr[0][2]=30;

arr[1][0]=40;
arr[1][1]=50;
arr[1][2]=60;


arr[2][0]=10;
arr[2][1]=20;
arr[2][2]=30;

for(int []x:arr){
 for(int y:x){
System.out.println(y);
}
}
}
}