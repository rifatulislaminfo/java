class circle{
    double radious;

    public double area(){
        return Math.PI*radious*radious;
    }
    public double perimeter(){
        return 2*Math.PI*radious;
    }
    public double circumference(){
        return perimeter();
    }



}

public class BasicOOP{

    public static void main(String args []){

        circle c=new circle();

        c.radious=7;

        System.out.println("Area is: "+c.area());
        System.out.println("Perimeter is: "+c.perimeter());
        System.out.println("Circumference is: "+c.circumference());

    }


}