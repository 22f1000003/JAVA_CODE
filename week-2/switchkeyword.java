package mypackage
public class switchkeyword {
    public static void main(String[] args) {
        int v = 1; // change this to test

        switch (v) {
            case -1:
                System.out.println("Negative");
                break;
            case 1:
                System.out.println("Positive");
                break;
            case 0:
                System.out.println("Zero");
                break;
            default:
                System.out.println("Unknown");
        }
    }
}