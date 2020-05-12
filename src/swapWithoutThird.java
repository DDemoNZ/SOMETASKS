public class swapWithoutThird {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        b = a + b - (a = b);
        System.out.println("a = " + a + " \nb = " + b);
    }
}
