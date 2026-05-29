import java.util.Scanner;

class Animalapps{
    public static void main(String[] args){
        System.out.println("1.Dog\n 2.Cat\n 3.Lion\n");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        AnimalFactory animalFactory = new AnimalFactory();
        switch (input){
            case 1:animalFactory.getanimalFactory("Dog").sound();
            break;
            case 2:animalFactory.getanimalFactory("Cat").sound();
            break;
            case 3:animalFactory.getanimalFactory("Lion").sound();
            break;
            case 4:System.exit(0);
            default:
                System.out.println("Invalid Input");
        }
    }

}

class AnimalFactory{
    public Animal getanimalFactory(String s){
        Animal a = null;
        if(s.equals("dog")){
           a = new Dog();
        }
        else if(s.equals("cat")){
            a = new Cat();
        }
        else{
            a = new Lion();
        }
        return a;
    }
}
public interface Animal{
    void sound();
}
class Cat implements Animal{
    public void sound(){
        System.out.println("I am a cat");
    }
}
class Dog implements Animal{
    public void sound(){
        System.out.println("I am a dog");
    }
}
class Lion implements Animal{
    public void sound(){
        System.out.println("I am a lion");
    }
}