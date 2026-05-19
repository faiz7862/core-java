public class MulipleInheritance implements Interface3 {
    public void print(){
        System.out.println("Interface1 is called");
    }
    public void print(int x){
        System.out.println("Interface3 is called");
    }
    public static void main(String[] args){
        MulipleInheritance m = new MulipleInheritance();
        m.print();
        m.print(10);
    }
}

interface Interface1 {
    void print();
}
interface Interface3 extends Interface1 {
    void print(int x);
}
