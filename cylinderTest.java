class cylinder{
    public double redius;
    public double height;
    
    public double lidArea(){
        return Math.PI*redius*redius;
    }
    public double totalSurfaceArea(){
        return 2*lidArea()+circumdirance()*height;
    }
    
    public double circumdirance(){
        return 2*Math.PI*redius;
    }
    public double volume(){
        return lidArea()*height;
    }
}
public class cylinderTest {

    public static void main(String[] args) {
        cylinder c=new cylinder();
        c.redius=10;
        c.height=20;
        
        System.out.println("The lidarea is: "+c.lidArea());
        System.out.println("The totalSurfaceArea is: "+c.totalSurfaceArea());
        System.out.println("The volume is: "+c.volume());
        System.out.println("The circumdirance is: "+c.circumdirance());
    }
    
}
