import java.util.HashMap;
import java.util.Map;

public class RomanToIntClass {

    static final Map<Character, Integer> romanNum = new HashMap<>();

    static {
        romanNum.put('I', 1);
        romanNum.put('V', 5);
        romanNum.put('X', 10);
        romanNum.put('L', 50);
        romanNum.put('C', 100);
        romanNum.put('D', 500);
        romanNum.put('M', 1000);
    }

    public static int RomanToInt(String roman) {
        int length = roman.length();
        int num = romanNum.get(roman.charAt(length - 1));
        for (int i = length - 2; i >= 0; i--) {
            if (romanNum.get(roman.charAt(i)) >= romanNum.get(roman.charAt(i + 1))) {
                num += romanNum.get(roman.charAt(i));
            } else {
                num -= romanNum.get(roman.charAt(i));
            }
        }
        return num;
    }

}
