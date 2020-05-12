import java.util.Arrays;

public class ShortestWordInString {
    public static void main(String[] args) {
        String str = "Hello world word strings hi";
        int res = Arrays.stream(str.split(" ")).mapToInt(String::length).min().getAsInt();
        System.out.println(res);
        String input = "(123) 456-7890";

        boolean result = input.matches("\\(\\d{3}\\)\\s\\d{3}-\\d{4}");
        System.out.println(result);
    }
}
