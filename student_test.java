import java.util.Scanner;

class student{
    public int roll;
    public String name;
    public String course;
    int s1,s2,s3;

    public int total(){
        return s1+s2+s3;
    }
    public int avarage(){
        return total()/3;
    }
    public String grade(){
        if(s1>=33 && s2>=33 && s3>=33) return "Pass";
        else return "Fail";
    }

    public String details(){
        return "Roll is: "+roll+"\n"+"Name : "+name+"\n"+"Course : "+course+"\n"+"Grade : "+grade()+"\n";
    }
}
public class student_test {
        public static void main(String[] args) {
            student s=new student();

            s.roll=46;
            s.name="rifat";
            s.course="Bangla";
            s.s1=40;
            s.s2=50;
            s.s3=33;

            System.out.println("Total : "+s.total());
            System.out.println("Avarage : "+s.avarage());
            System.out.println("Details :");
            System.out.println(s.details());
        }   

    
}
