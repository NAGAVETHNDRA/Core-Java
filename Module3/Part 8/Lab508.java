interface shape{
void draw();
}
class circle  implements shape{
public void draw(){
System.out.println("circle draw");
}
}

class Lab508{
public static void main(String as[]){
shape shape1=new circle();
shape1.draw();
}
}

