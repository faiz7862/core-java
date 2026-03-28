
public class ConstructorOverloading {
    public static void main(String[] args) {
        Mobile1 mb1 = new Mobile1("Lamborgini", "Blue", 3000000);
        Mobile1 mb2 = new Mobile1("Ferrari",40000);
        Mobile1 mb3 = new Mobile1();
      
        System.out.println((mb3));
        System.out.println(mb2.name + " " + mb2.price);
        System.out.println("Name:" + mb1.name + "Color: " + mb1.color + "Price: " + mb1.price);
        
    }
}

class Mobile1 {
    public String name;
    public String color;
    public int price;
    
     Mobile1(String name, String color, int price){
        this.name = name;
        this.color = color;
        this.price = price;
    }
     Mobile1(String name,int price){
        this.name = name;
        this.price = price;
    }
     Mobile1(){
        this.name = "ferrari";
    }
}
