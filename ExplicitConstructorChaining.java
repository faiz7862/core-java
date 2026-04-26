//Constructor calling, Constructor chaining(Implicit and Explicit chaining)
//All the methods are implemented in this code

class A1{
    A1(){
        this(10);
        System.out.println("In class A1 constructor");
    }
    A1(int b){
        System.out.println("In class A1 Int parameter constructor");
    }
}
class B1 extends A1{
    B1(double a){
        System.out.println("In class B1 constructor");
    }
}
class C1 extends B1{
    C1(){
        super(22.22);
        System.out.println("In class C1 constructor");
    }
}
class D1 extends C1{
    D1(){
        System.out.println("In class D1 constructor");
    }
}
public class ExplicitConstructorChaining {
    public static void main(String[] args) {
        new D1();
    }
}


