public class ConstructorInitialisation {
    public static void main(String[] args) {
        Mobile mb1 = new Mobile("Lamborgini", "Blue", 3000000);
        Mobile mb2 = new Mobile("Ferarri", "Grey", 5000000);
        Mobile mb3 = new Mobile("Mercedes", "Yellow", 7000000);
        Mobile mb4 = new Mobile("Supra", "Aqua", 9000000);

        System.out.println("Name:" + mb1.name + "Color: " + mb1.color + "Price: " + mb1.price);
        System.out.println("Name:" + mb2.name + "Color: " + mb2.color + "Price: " + mb2.price);
        System.out.println("Name:" + mb3.name + "Color: " + mb3.color + "Price: " + mb3.price);
        System.out.println("Name:" + mb4.name + "Color: " + mb4.color + "Price: " + mb4.price);
    }
}

class Mobile {
    public String name;
    public String color;
    public int price;
    
    public Mobile(String name, String color, int price){
        this.name = name;
        this.color = color;
        this.price = price;
    }
}
