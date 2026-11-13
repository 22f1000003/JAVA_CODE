

class MyEmployee{
    private int id;
    private String name;
    public void setName(String n) {
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i) {
        this.id = i;
    }
    public int  getId(){
        return id;
    }
}
public class cwh_40_ch9 {
    public static void main(String[] args) {
        MyEmployee sam = new MyEmployee();
        //sam.id = 90;
        //sam.name = "satyam";
        sam.setName("satyam");
        System.err.println(sam.getName());
        sam.setId(342323);
        System.err.println(sam.getId());
    }
    
}