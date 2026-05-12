public class Object1 {
    public static boolean view(int x, Mobile2 s,Car c) {
        Book b = new Book();
        return false;
    }

    public static void main(String[] args) {
        int x = 5;
        Mobile2 m2 = new Mobile2();
        Car c = new Car();
        boolean b = view(x,m2,c);
        System.out.println(b);
//        System.out.println(e.toString());
        System.out.println(m2);
//        System.out.println(m2.toString());
    }
}
class Mobile2{
    Mobile2(){
        System.out.println("Mobile2");
    }
}
class Car{
    Car(){
        System.out.println("Car");
    }

}
class Book{
    Book(){
        System.out.println("Book");
    }
}