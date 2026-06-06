import java.util.*;
// main class
public class Artist {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Circle\n2.Triangle\n3.Rectangle\n4.Square");
        int i = sc.nextInt();
        ShapeFactory sf = new ShapeFactory();
        switch (i) {
            case 1:sf.getShape("Circle").draw();;                                
                break;
            case 2: sf.getShape("Triangle").draw();;
                break;
            case 3: sf.getShape("Rectangle").draw();;
                break;
            case 4: sf.getShape("Square").draw();;
                break;
            default:System.out.println("Invalid input");
                break;
        }
    }
}
// ShapeFactory factory method
class ShapeFactory{
   public Shape getShape(String s){
    Shape shape = null;
    if(s.equals("Circle")){
        shape = new Circle();
    }
    else if(s.equals("Triangle")){
        shape = new Triangle();
    }
    else if(s.equals("Rectangle")){
        shape = new Rectangle();
    }
    else if(s.equals("Square")){
        shape = new Square();
    }
    return shape;
   }
}
// Shape interface
interface Shape {
    void draw();    
}
// implementation class 
class Circle implements Shape{
    public void draw(){
        System.out.println("Circle");
    }
}
class Square implements Shape{
    public void draw(){
        System.out.println("Square");
    }
}
class Rectangle implements Shape{
    public void draw(){
        System.out.println("Rectangle");
    }
}
class Triangle implements Shape{
    public void draw(){
        System.out.println("Triangle");
    }
}