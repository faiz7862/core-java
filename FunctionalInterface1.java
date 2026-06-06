public class FunctionalInterface1 {
    public static void main(String[] args) {
       Functional f = new InterfaceImp();
    //    f.print();
       f.disp();
    }
}
@FunctionalInterface
interface Functional{
    void disp();
    // void print();
}
class InterfaceImp implements Functional{
    public void disp(){
        System.out.println("Inside disp method");
    }
    public void print(){
        System.out.println("Inside print method");
    }
}
