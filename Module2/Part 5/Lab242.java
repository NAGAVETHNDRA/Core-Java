class Lab242{
public static void main(String as[]){

int temp[][]={
{10,20,30,40,50,60},
{99,999},
{1,2,3,4,5,6,7,8,9},
{11,22,33,44,55,66,77,88}
};

for(int []x:temp){
 for(int y:x){
System.out.print(y+"\t");
}
System.out.println("");
}
}
}