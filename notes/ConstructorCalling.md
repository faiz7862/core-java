
class Test{
Test(){
this(32,76.67);
System.out.println("No arg constructor");
}

Test(int arg){
this(3.44);
System.out.println("int arg constructor");
}
Test(double arg){
this();
System.out.pdintln("double arg constructor");|
}
Test(int arg1, double arg2){
System.out.println("int-double arg constructor");
}
class Program2{
public static void main(String[] args){

    new Test(43);
    System.out.println();
    new Test(65.56);
    }
}