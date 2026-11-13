// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class MyClass {

    public static int sumupto(int n) {
        int sum = 0;
        int i = 0;

        do {
            sum += i;
            i++;
        } while (i <= n);

        return sum;
    }

    public static void main(String[] args) {
        int result = sumupto(15);
        System.out.println(result);
    }
    
}