class MainMethodOverloading{
    public static void main(int[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
    public static void main(char[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
    public static void main(double[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}

class InnerMainMethodOverloading {

    public static void main(String[] args) {
        int[] integer1 = {10,20,30,40};
        char[] charac = {'a','b','f','e'};
        double[] doub = {10.23,20.44,30.23,40.12};
        String[] str = {"hii","bye","tata"};
        MainMethodOverloading.main(integer1);
        MainMethodOverloading.main(charac);
        MainMethodOverloading.main(doub);
        MainMethodOverloading.main(str);
    }
}