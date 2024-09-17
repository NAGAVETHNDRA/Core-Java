abstract class shape{
abstract void area();
abstract void draw();
}
abstract class circle extends shape{
void draw(){
System.out.println("circle-draw");
}
}

class mycircle extends circle{
void area(){
System.out.println("mycircle-area");
}
}
public class  Lab474{
public static void main(String as[]){
shape myshape=new mycircle();
myshape.area();
myshape.draw();
}
}