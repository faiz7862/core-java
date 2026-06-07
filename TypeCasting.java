public class TypeCasting {
    public static void main(String[] args){
        A a  = new B(); //performing upcasting
        B b =(B) a;// after performing upcasting downcasting is done..
        a.print();
        System.out.println(a.x);
        System.out.println("Printing hidden values through downcasting methods");
        b.show();
        System.out.println(b.y);
    }
}

class A{
    int x = 10;
    void print(){
        System.out.println("Print method");
    }
}
class B extends A{
    int y = 15;
    void show(){
        System.out.println("Show method");
    }
}
