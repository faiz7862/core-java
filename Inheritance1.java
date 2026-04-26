public class Inheritance1 {
    int x=5;
     int z=4;
    public void disp(String[] args){
        // Inheritance1 in = new Inheritance1();
        System.out.println("Inside the Parent class");
    }
}

class InnerInheritance1 extends Inheritance1{
    static int a = 6;
    int b = 9;
    public void disp(){
        System.out.println("Inside the child class.");
    }
    
}
class Inheritance2{
    Inheritance2(){
        System.out.println("Inside the Inheritance2 class");
    }
}
class Inheritance3 extends Inheritance2{
    Inheritance3(){
        System.out.println("Inside the Inheritance3 class");
    }
}
class Main{
    public static void main(String[] args) {
//        InnerInheritance1  inheritance = new InnerInheritance1();
//        System.out.println(inheritance.x);
//        System.out.println(inheritance.z);
//        System.out.println(inheritance.b);

        new Inheritance2();
    }
}