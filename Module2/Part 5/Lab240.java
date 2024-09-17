class Lab240{
public static void main(String as[]){
int arr[][]={{10,20,30},{40,50,60},{70,80,90}};

for(int i=0;i<arr.length;i++){
 for(int j=0;j<arr[i].length;j++){
System.out.print(arr[i][j]+"\t");
}
System.out.println("");

}
System.out.println("--------");

for(int []x:arr){
 for(int y:x){
System.out.print(y+"\t");
}
System.out.println("");

}
}
}