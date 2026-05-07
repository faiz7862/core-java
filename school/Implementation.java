package school;

public class Implementation extends StudentA {
    public int percentage() {
        System.out.println("marks is "+marks);
        return (marks/100)*100;
    }
    public static void main(String[] args) {
        Implementation impl = new Implementation();
        System.out.println("The percentage is: "+impl.percentage());
    }
}
