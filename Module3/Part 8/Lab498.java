interface inter1{}
interface inter2{}

class A{}
class B{}

class Hello1 extends A{}
//class Hello2 extends A,B{}
class Hello3 implements inter1{}
class Hello4 implements inter1,inter2{}

interface inter3 extends inter1{}
interface inter4 extends inter1,inter2{}

//interface inter5 implements inter1{}
//interface inter6 implements inter1,inter2{}

//interface inter7 extends A{}
//interface inter8 implements A{}


