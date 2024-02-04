class subject{
    private String subId;
    private String name;
    private int maxMarks;


    public subject(String subId,String name,int maxMarks){
        this.subId=subId;
        this.name=name;
        this.maxMarks=maxMarks;
    }

    public String getSubId(){
        return subId;
    }
    public String getName(){
        return name;
    }
    public int getMaxMarks(){
        return maxMarks;
    }
    public String toString(){
        return "Subject Id: "+subId+"\nSubject Name: "+name+"\nMarks: "+maxMarks+"\n\n";
    }

}
public class subject_test {

    public static void main(String[] args) {
        
        subject sub[]=new subject[3];
        sub[0]=new subject("CSE101", "DS", 100);
        sub[1]=new subject("CSE331", "DLD", 100);
        sub[2]=new subject("CSE301", "Algorithm", 100);

        for(subject s: sub){
            System.out.println(s);
        }

    }
    
}
