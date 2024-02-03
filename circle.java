class circle{
	public double radious;
	
	public double circl(){
	
		return MATH.PI*radious;
	}
	public double parameter(){
	
	return 2*radious;
	}
	public double area(){
	return parameter();
	}


}

public class class1{
	public static void main(String args[]){
	
		circle c1=new circle();
		c1.radious=7;
		
		System.out.println(c1.circl());
		System.out.println(c1.parameter());
		System.out.println(c1.area());
	}



}
