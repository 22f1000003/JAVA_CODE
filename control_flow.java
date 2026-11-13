public class control_flow {
    public static int sign(int v) {
        if (v<0) {
            return (-1);
        } else if (v>0) {
            return (1);
        } else {
            return (0);
        }

    }public static void main(String[] args) {
        int result = sign(15);
        System.out.println(result);
    }
}
    

