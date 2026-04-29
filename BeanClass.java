class InnerBeanClass{
    private String name;
    private int marks;

    public InnerBeanClass(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }
}
public class BeanClass {
    public static void main(String[] args) {
        InnerBeanClass ib = new InnerBeanClass("Faiz", 90);
        System.out.println(ib.getName());
        System.out.println(ib.getMarks());
        ib.setMarks(72);
        ib.setName("Akram");
        // System.out.println("This is the java bean class");
        System.out.println(ib.getMarks());
        System.out.println(ib.getName());
    }
}
