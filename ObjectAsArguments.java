class ObjectClass{
    public ObjectAsArguments print(ObjectAsArguments arguments){
        return new ObjectAsArguments();
    }
}
public class ObjectAsArguments {
    public static void main(String[] args) {
        ObjectClass oc = new ObjectClass();
        ObjectAsArguments arguments= oc.print(new ObjectAsArguments());
        System.out.println(arguments);
    }
}
