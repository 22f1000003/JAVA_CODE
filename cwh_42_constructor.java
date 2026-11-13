class MymainEmployee{
    private int id;
    private String name;
    // here i add constructor 
    public MymainEmployee(String myName, int myId)  {
        id = myId;
        name = myName;
    }
    // overload in constructor is allow you can overload 
    // but in overload every time take different parameter
    public MymainEmployee(){
        id = 45;
        name = "sajbjb";
    }
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
public class cwh_42_constructor {
    public static void main(String[] args) {
        //MymainEmployee sam = new MymainEmployee("satyam", 21);
        MymainEmployee sam = new MymainEmployee();
        System.out.println(sam.getName());
        System.out.println(sam.getId());
    }
}