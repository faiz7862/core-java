import java.util.Scanner;

abstract public class Animal {
    public abstract void sound();
    public static void main(String[] args) {
        System.out.println("1.Dog\n2.Cat\n3.Dog\4.Exit");
        System.out.print("Enter your choice: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        switch (num){
            case(1):
                new Dog().sound();
                break;
            case(2):
                new Cat().sound();
                break;
            case(3):
                new Lion().sound();
                break;
            case(4):
                System.exit(0);
        }
    }
}
class Dog extends Animal {
    public void sound() {
        System.out.println("Bhou Bhou");
    }
}
class Cat extends Animal{
    public void sound() {
        System.out.println("Meao Meao");
    }
}
class Lion extends Animal{
    public void sound() {
        System.out.println("Roar");
    }
}
