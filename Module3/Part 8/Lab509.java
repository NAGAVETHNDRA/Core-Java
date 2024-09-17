interface shape{
void draw();
}
class circle  implements shape{
public void draw(){
System.out.println("circle draw");
}
}

class Lab509{
public static void main(String as[]){
shape shape1=new circle(){
public void draw(){
System.out.println("Annonymous shape-draw");
}
};
shape1.draw();
}
}

