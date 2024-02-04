class studentt{
    private int rollNO;
    private String name;
    private String department;
    private String subject;

    public studentt(int rollNO,String name,String department,String subject){
        this.rollNO=rollNO;
        this.name=name;
        this.department=department;
        this.subject=subject;
    }

    // public void getRollNo(int rollNO){
    //     this.rollNO=rollNO;
    // }
    // public void getName(String name){
    //     this.name=name;
    // }
    // public void getDepartment(String department){
    //     this.department=department;
    // }
    // public void getSubject(String subject){
    //     this.subject=subject;
    // }

        public String toString(){
            return "Roll Number: "+rollNO+"\nName: "+name+"\nDepartment: "+department+"\nSubject: "+subject+"\n\n";
        }
        // public void display(){
        //     System.out.println("Roll Number: "+rollNO+"\nName: "+name+"\nDepartment: "+department+"\nSubject: "+subject+"\n\n");
        // }

}
public class studentTest {
    public static void main(String[] args) {
            
        studentt s[]=new studentt[3];

        s[0]=new studentt(46, "Rifatul Islam", "CSE", "Algorithm");
        s[1]=new studentt(193, "Noman Bhuyan", "CSE", "DLD");
        s[2]=new studentt(47, "Ali", "EEE", "Electric");


        // for(student x:s){
        //     System.out.println(x);
        // }

        for(int i=0;i<3;i++){
            System.out.println(s[i]);
            //s[i].get();
        }
    }    
}
