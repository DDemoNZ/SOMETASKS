package ROMANTOARABIC.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class calculate {
    public static int calculate(int first, int second, String action) {
        int result = 0;
        switch (action) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                result = first / second;
                break;
                default:
                    System.out.println("Incorrect action operator. ");
        }
        return result;
    }
}
