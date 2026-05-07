package gmail.login;

public class Test {
    public int x = 15;
    protected int y =20;
    int z = 25;
    private int a = 30;

    public void test(){
        System.out.println("Inside the test method");
    }

    // using getter and setter
    public int getZ(){
        return z;
    }
    public void setZ(int z){
        this.z = z;
    }

    public int getA(){
        return a;
    }
    public void setA(int a){
        this.a = a;
    }
}
