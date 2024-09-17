abstract class shape{
abstract void area();
abstract void draw();
}
class cirlce extends shape{
}
class  Lab473{
public static void main(String as[]){
shape myshape=new circle();
myshape.area();
myshape.draw();
}
}