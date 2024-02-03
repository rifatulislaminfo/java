class Ractangle{
    double length;
    double breadth;

    public double area(){
        return length*breadth;
    }
    public double prtimeter(){
        return 2*(length+breadth);
    }

    public boolean isSqure(){
        // if(length==breadth) return true;
        // else return false;
        return length==breadth;
    }
}
public class RectangleTest {

    public static void main(String[] args) {
        Ractangle r=new Ractangle();
        r.length=5;
        r.breadth=5;

        System.out.println("The area is: "+r.area());
        System.out.println("The prtimeter is: "+r.prtimeter());
        
        // if(r.isSqure()==true) System.out.println("This is squre");
        // else System.out.println("This is not squre");
        
        System.out.println("This is squre ? "+r.isSqure());

    }
    
}
