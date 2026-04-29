public class ConstructorChaining {
    public static void print(){
        System.out.println("This is print method");
    }
    ConstructorChaining(){
        System.out.println("first line of code");
        // this(12.23);
    
        System.out.println("No argument constructor ");
    }
    ConstructorChaining(int a){
        this(22.3);
        System.out.println("Int argument constructor "+ a);
    }
    ConstructorChaining(double b){
        this(12,28.54);
        System.out.println("Double argument constructor "+b);
    }
    ConstructorChaining(int a, double b){
        System.out.println("Two parameter argument constructor "+a +" "+b);
    }
    public static void main(String[] args) {
         new ConstructorChaining();
    }
}