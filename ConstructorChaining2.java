class Calculator1{
    int x;
    int y;
    Calculator1(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Addition extends Calculator1{
    Addition(int x,int y){
        super(x,y);
    }
    void sum(){
        System.out.println("The sum is :" +(x+y));
    }
}
class Subtraction extends Calculator1{
    Subtraction(int x,int y){
        super(x,y);
    }
    void sub(){
        System.out.println("The subtraction is :" +(x-y));
    }
}
class Multiplication extends Calculator1{
    Multiplication(int x,int y){
        super(x,y);
    }
    void multi(){
        System.out.println("The multiplication is :" +(x*y));
    }
}
class Division extends Calculator1{
    Division(int x,int y){
        super(x,y);
    }
    void div(){
        System.out.println("The division is :" +(x/y));
    }
}
public class ConstructorChaining2 {
    public static void main(String[] args){
        Addition obj = new Addition(10,20);
        obj.sum();
        Subtraction obj2 = new Subtraction(10,20);
        obj2.sub();
        Multiplication obj3 = new Multiplication(10,20);
        obj3.multi();
        Division obj4 = new Division(10,20);
        obj4.div();
    }
}
