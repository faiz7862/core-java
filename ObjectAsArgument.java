public class ObjectAsArgument {
    public static void main(String[] args) {
//        ObjectAsArgument1 ob1 = new ObjectAsArgument1();
//        ObjectAsArguments ob = new ObjectAsArguments();
//        ob1.print(ob1);
        new ObjectAsArgument1().print().print().print();
    }
}
class ObjectAsArgument1 {
    public ObjectAsArgument2 print() {
        System.out.println("ObjectAsArgument1 print");
        return new ObjectAsArgument2();
    }
}
class ObjectAsArgument2 {
    public ObjectAsArgument3 print() {
        System.out.println("ObjectAsArgument2");
        return new ObjectAsArgument3();
    }
}
class ObjectAsArgument3 {
    public void print() {
        System.out.println("ObjectAsArgument3 print");
    }
}
