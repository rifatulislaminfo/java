class constructor{
    private String name;
    private int age;
    

    public constructor(){
        name="Null";
        age=0;
    }

    public constructor(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
}

public class constructor_code {
    public static void main(String[] args) {
            //constructor c=new constructor();
          constructor c=new constructor("Rifat",22);
            System.out.println(c.getname()+"\n"+c.getage());
    }
    
}
