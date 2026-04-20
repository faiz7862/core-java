class InstanceOverloading {
    public static void main(String[] args) {
        Overloading ov = new Overloading();

        System.out.println(ov.sum(10, 20));          // int
        System.out.println(ov.sum(10.1f, 20.2f));    // float
        System.out.println(ov.sum(10.23, 20.47));    // double
    }
}

class Overloading {
    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public float sum(float a, float b) {
        return a + b;
    }
}