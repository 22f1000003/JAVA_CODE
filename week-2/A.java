class A 
{
    final int a;
    final int b;
    A(int a , int b){
        this.a = a;
        this.b = b;
    }
    public void show() {
        System.out.println("Fiest number " + a);
        System.out.println("Second number" + b);
    }
    public static void main(String[] args){
        A satyam = new A(4,6);
        satyam.show();
    }
}