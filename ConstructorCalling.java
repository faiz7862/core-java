public class ConstructorCalling {
    public static void print(){
        System.out.println("This is print method");
    }
    ConstructorCalling(){
        System.out.println("first line of code");
        // this(12.23);
        this(5);
        System.out.println("No argument constructor ");
    }
    ConstructorCalling(int a){
        this(22.3);
        System.out.println("Int argument constructor "+ a);
    }
    ConstructorCalling(double b){
        this(12,28.54);
        System.out.println("Double argument constructor "+b);
    }
    ConstructorCalling(int a, double b){

        System.out.println("Two parameter argument constructor "+a +" "+b);
    }
    public static void main(String[] args) {

        new ConstructorCalling();
    }
}