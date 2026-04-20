class A{
    A(){
        System.out.println("In class A constructor");
    }
}
class B extends A{
    B(){
        System.out.println("In class B constructor");
    }
}
class C extends B{
    C(){
        System.out.println("In class C constructor");
    }
}
class D extends C{
    D(){
        System.out.println("In class D constructor");
    }
}
public class ImplicitConstructorChaining {
    public static void main(String[] args) {
        new D();
    }
}
