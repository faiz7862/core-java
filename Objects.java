public class Objects {
    public static void main(String[] args) {
        InnerObjects a1;
        InnerObjects a2;
        a1 = new InnerObjects();
        a2 = new InnerObjects();
        System.out.println(a1.x);
        System.out.println(a2.x);
        System.out.println(a1.prints());
        System.out.println(a2.prints());
    }
}
class InnerObjects {
    public int x = 5;
    public int prints(){
        return 2;
    }
    
}