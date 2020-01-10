public class Slogan {
    //variables
    private static int count;
    private String slogan;

    public Slogan(String slogan){
        this.slogan = slogan;
        count++;
    }

    public static int getCount(){
        return count;
    }

    public String toString(){
        return slogan;
    }
}
