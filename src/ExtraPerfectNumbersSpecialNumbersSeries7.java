import java.util.stream.IntStream;

public class ExtraPerfectNumbersSpecialNumbersSeries7 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "ell";

        int[] arr = {4, 2, 6, 8, 5, 0};
        String s = "125493";
        System.out.println(IntStream.range(0, s.length() - 1)
                .allMatch(i -> Math.abs(s.charAt(i) - s.charAt(i + 1)) == 1)
                ? "Jumping!!" : "Not!!");
    }
}
