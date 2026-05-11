public class Object1 {
    public static Book view(Mobile2 s,Car c) {
        Book b = new Book();
        return b;
    }

    public static void main(String[] args) {
        Mobile2 m2 = new Mobile2();
        Car c = new Car();
        Book b = view(m2,c);
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