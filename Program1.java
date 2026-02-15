public class Program1 {
    public static int x = 10;
    public static int y = 12;
    public static void main(String[] args){
        System.out.println("Summation of x and y are : "+ Calculator.addNum());
        System.out.println("Subtraction of x and y are : "+ Calculator.subNum());
        System.out.println("Multipication of x and y are : "+ Calculator.mulNum());
        System.out.println("Division of x and y are : "+ Calculator.divNum());
    }
}
class Calculator {
    public static int addNum(){
        return Program1.x+Program1.y;
    }
    public static int subNum(){
        return Program1.x - Program1.y;
    }
    public static int mulNum(){
        return Program1.x * Program1.y;
    }
    public static int divNum(){
        return Program1.x / Program1.y;
    }
}
