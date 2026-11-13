
class CWH {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("taing the width");
        int w = sc.nextInt();
        int h = sc.nextInt();
        Rectangle r = new Rectangle();
        r.setw(w);
        r,seth(h);
        int area = r,area();
        System.out.print(area);
    }
}
class Rectangle {
    int w;
    int h;
    public void setw(int w) {
        this.w = w;
    }
    public void seth(int h) {
        this.h = h;
    }
    public int area() {
        return w * h;
   
    }

}
