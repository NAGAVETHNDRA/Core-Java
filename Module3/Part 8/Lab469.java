class shape{
void area(){
System.out.println("shape-area()");
}
void draw(){
System.out.println("shape-draw()");
}
}
class  Lab469{
public static void main(String as[]){
shape myshape=new shape();
myshape.area();
myshape.draw();
}
}