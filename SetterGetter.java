class values{
    private int length;
    private int width;

    public void setter(int l,int w){

        if(l>0) this.length=l;
        else this.length=0;

        if(w>0) this.width=w;
        else this.width=0;
    }
    public int getmathod(){
        return length*width;
    }
}

public class SetterGetter {
        public static void main(String[] args) {
            values v=new values();
            v.setter(5,10);

            System.out.println(v.getmathod());
        }    
}
