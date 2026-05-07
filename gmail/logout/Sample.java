package gmail.logout;
import gmail.login.*;

public class Sample extends Test {
    public void sample(){
        System.out.println("Inside the Sample class");
//        gmail.login.Main main1 = new gmail.login.Main();
//        gmail.logout.Main main2 = new gmail.logout.Main();
        gmail.login.Main.main(new String[]{"args"});
        System.out.println("Public x value of Test.java is: "+x);
        System.out.println("Public y value of Test.java is: "+y);
        Test test = new Test();
        System.out.println("Public z value of Test.java is: "+test.getZ());
        System.out.println("Public a value of Test.java is: "+test.getA());
    }
}
