import java.util.Scanner;

class st{
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int total(){
        return a+b+c;
    }
    int avg(){
        return total()/3;
    }

    String print(){
        if(a>=33) return "Pass";
        else return "Fail";
    }
}
public class test {
    public static void main(String[] args) {
        st b = new st();
        System.out.println(b.total());
        System.out.println(b.avg());
        System.out.println(b.print());
    }
}
