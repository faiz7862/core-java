import java.util.Scanner;

class Animalapps{
    public static void main(String[] args){
        System.out.println("1.Dog\n2.Cat\n3.Lion\n4.Exit");
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
        if(s.equals("Dog")){
           a = new Dog();
        }
        else if(s.equals("Cat")){
            a = new Cat();
        }
        else if(s.equals("Lion")){
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
        System.out.println("I am a Cat");
    }
}
class Dog implements Animal{
    public void sound(){
        System.out.println("I am a Dog");
    }
}
class Lion implements Animal{
    public void sound(){
        System.out.println("I am a Lion");
    }
}