package ROMANTOARABIC.company;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String roman) {

        Map<Character, Integer> romanNum = new HashMap<>();

        romanNum.put('I', 1);
        romanNum.put('V', 5);
        romanNum.put('X', 10);
        romanNum.put('L', 50);
        romanNum.put('C', 100);
        romanNum.put('D', 500);
        romanNum.put('M', 1000);

        int length = roman.length();
        int result = romanNum.get(roman.charAt(length - 1));

        for (int i = length - 2; i >= 0; i--) {
            if (romanNum.get(roman.charAt(i)) >= romanNum.get(roman.charAt(i + 1))) {
                result += romanNum.get(roman.charAt(i));
            } else {
                result -= romanNum.get(roman.charAt(i));
            }
        }

        return result;
    }
}
