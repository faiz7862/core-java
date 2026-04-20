public class MethodOverloading {
    public static void main(){
        System.out.println("No parameter method called");
    }
    public static void main(int x){
        System.out.println("The value is: "+x);
    }
    public static void main(String[] args) {
        System.out.println("Main method is called.");
        for(String i:args){
            System.out.print(i+" ");
        }
    }
}

//class Overloading{
//    public static void main(String[] args){
//        MethodOverloading.main();
//        MethodOverloading.main(5);
//        String[] s = {"hello","hii","tata","bye"};
//        MethodOverloading.main(s);
//    }
//}