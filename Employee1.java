class Employee1 {
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
    
}
class CellPhone{
  public void ringing(){
    System.out.println("Ringing....");
  }
  public void vibrate() {
    System.out.println("Vibrate....");
  }
  public void callFrind() {
    System.out.println("calling..");
  }
}

 class cwh_39 {
    public static void main(String[] args){
        // problem1
        Employee1 sam = new Employee1();
        
        sam.setName("satyam");
        sam.salary = 233; // Changed "Salary" to "salary"
        
        System.out.println(sam.getName());
        System.out.println(sam.getSalary());
        CellPhone vivov3 = new CellPhone();
        vivov3.vibrate();
        vivov3.ringing();
        vivov3.callFrind();
        
    }
}