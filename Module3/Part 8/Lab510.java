interface shape{
void draw();
}

class Hello{
int a=99;
shape myshape=new shape(){
public void draw(){
System.out.println("Annonymous shape-draw");
}
};


}

class Lab510{
public static void main(String as[]){
Hello h=new Hello();
System.out.println(h.a);
System.out.println(h.myshape);

}

}

