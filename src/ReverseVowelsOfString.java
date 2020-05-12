import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseVowelsOfString {

    private static final List<Character> VOWELS;

    static {
        VOWELS = new ArrayList<>(List.of('a', 'e', 'o', 'i', 'u', 'A', 'E', 'O', 'I', 'U'));
    }

    public static String revers(String s) {
        int start, end;
        start = 0;
        int length = s.length();
        end = length - 1;
        char[] string = s.toCharArray();
        for (int i = 0, j = end; i <= j;) {
            if (VOWELS.contains(string[i])) {
                if (VOWELS.contains(string[j])) {
                    char temp = string[i];
                    string[i] = string[j];
                    string[j] = temp;
                    i++;
                }
                j--;
            } else {
                i++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char x : string) {
            sb.append(x);
        }
//        return sb.toString();
        return new String(string);
    }

}
