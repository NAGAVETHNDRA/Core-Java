class Lab245{
public static void main(String as[]){

int arr[][][]={
{{10,20,30},{40,50,60},{70,80,90}},
{{100,200,300},{400,500,600},{700,800,900}},
{{1,2,3},{4,5,6},{7,8,9}},
};

for(int i=0;i<arr.length;i++){
 for(int j=0;j<arr[i].length;j++){
  for(int k=0;k<arr[j].length;k++){
System.out.print(arr[i][j][k]+"\t");
}
System.out.println("");
}
System.out.println("");
}
}
}