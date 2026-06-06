public class PrivateConstructor {
    private PrivateConstructor(){
        System.out.println("Private Constructor");
    }
    public static PrivateConstructor getConstructor(){
        PrivateConstructor pc = new PrivateConstructor();
        return pc;
    }
}

class Main{
    public static void main(String[] args) {
        PrivateConstructor.getConstructor();
        PrivateConstructor.getConstructor();
        PrivateConstructor.getConstructor();
        PrivateConstructor.getConstructor();
    }
}
