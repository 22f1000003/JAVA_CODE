/*public class MyClass {
    public static int sumupto(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n;
            n--;
        }
        return(sum);
    }
}*/
/*public class MYclass  {
    public static int sumupto(int n) {
        int sum = 0;
        int i = 0;
        do { 
            sum += i;
            i++;
        } while (i <= n);
        return(sum);
    }
    public static void main(String args[])
    {
        System.out.println(sumupto(10));
    }
}*/
public class MYclass {
    public static int sumarray(int[] a) {
        int sum = 0;
        int n = a.length;
        for(int v : a) {
            sum += v;
        }
        return(sum);
    }
    public static void main(String args[])
    {
        int[] number = {1,2,3,4,5};
         System.out.println(sumarray(number));
    }
}