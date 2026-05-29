interface InnerInterface20 {
    int x = 5;  // public static final by default
    public void print(int x);
}

interface InnerInterface21 extends InnerInterface20 {
    int y = 5;  // another constant
    public void print();
}

class Interface2 implements InnerInterface21 {
    
    @Override
    public void print() {
        System.out.println("Called print() with no arguments");
    }

    @Override
    public void print(int x) {
        System.out.println("Called print(int) with argument: " + x);
    }

    public static void main(String[] args) {
        Interface2 ift = new Interface2();
        ift.print();       // calls no-argument version
        ift.print(5);      // calls int version with 5
        ift.print(x);      // prints 5 from InnerInterface20
        ift.print(y);      // prints 5 from InnerInterface21
    }
}
