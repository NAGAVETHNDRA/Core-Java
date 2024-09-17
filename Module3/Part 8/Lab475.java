abstract class shape{
abstract void draw();
}
class circle extends shape{
void draw(){
System.out.println("circle-draw");
}
}
class square extends shape{
void draw(){
System.out.println("square-draw");
}
}

public class  Lab475{
public static void main(String as[]){
shape myshape=null;
myshape=new circle();
myshape.draw();
myshape=new square();
myshape.draw();

}
}