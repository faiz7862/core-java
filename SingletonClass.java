public class SingletonClass {
    // public static SingletonClass sc;
    private SingletonClass(){
        System.out.println("This is singleton class.");
    }
    public static SingletonClass sc = null;
    public static SingletonClass getSingletonClass(){
        if(sc==null){
            sc = new SingletonClass();
        }
        return sc;
    }
}

class SingletonMain{
    public static void main(String[] args) {
        // SingletonClass sc = new SingletonClass();
        SingletonClass.getSingletonClass();
    }
}