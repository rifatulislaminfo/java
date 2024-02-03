class value{
    private int roll;

    public void setroll(int r){
        this.roll =r;
    }
    public int getroll(){
        return roll;
    }
}
public class setAndget {

    public static void main(String[] args) {
        
        value v=new value();
        v.setroll(10);

        System.out.println(v.getroll());
    }
    
}
