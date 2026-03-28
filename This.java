
public class This {
    int i=5;
    void setValue(int i){
        i=i;
    }
    void show(){
        System.out.println(i);
    }
}
class Xyz{
    public static void main(String[] args){
        This t = new This();
        t.setValue(10);
        t.show();
    }
}

