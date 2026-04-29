public class DataHiding {
    private int var;
    public DataHiding(int var){
        this.var = var;
    }
    public int getVar(){
        // int newVar = var;
        return var;
    }
    
    public void setVar(int var){
        this.var = var;
    }
}

class InnerDataHiding {
    public static void main(String[] args) {
        DataHiding dh = new DataHiding(20);
        dh.setVar(50);
        System.out.println("The data value is: "+dh.getVar());
    }
    
}