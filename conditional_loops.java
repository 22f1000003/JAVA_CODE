public class conditional_loops {
    public static int sumupto(int n) {
        int sum = 0;
        while (n>0) {
            sum += n;
            n--;
        }
        return(sum);
    }
    
    }
    public static void main(String[] args) {
        int result = sumupto(n: 15);
        System.out.println(result);
    }

