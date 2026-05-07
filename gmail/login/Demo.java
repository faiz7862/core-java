package gmail.login;

public class Demo {
    public void demo(){
        System.out.println("Inside the Demo class");
        System.out.println("calling test objects");
        Test test = new Test();
        System.out.println("The private value is: "+ test.getA());
        test.setA(20);
        System.out.println("The private set value is: "+test.getA());
        test.test();
    }
}
