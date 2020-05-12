package ROMANTOARABIC.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter \"a\" if numbers are arabic and \"r\" if numbers are roman: ");
        String type = reader.readLine();

        System.out.print("Enter the first operator: ");
        String firstOperator = reader.readLine();

        System.out.print("Enter the action operator: ");
        String actionOperator = reader.readLine();

        System.out.print("Enter the second operator: ");
        String secondOperator = reader.readLine();

        if(type.equals("a")){
            int firstIntOperator = Integer.parseInt(firstOperator);
            int secondIntOperator = Integer.parseInt(secondOperator);
            int result = calculate.calculate(firstIntOperator, secondIntOperator, actionOperator);
            System.out.println(firstIntOperator +" "+ actionOperator + " " + secondIntOperator + " = " + result);
        }else if(type.equals("r")){
            int firstIntOperator = RomanToInteger.romanToInt(firstOperator);
            int secondIntOperator = RomanToInteger.romanToInt(secondOperator);
            int resultInt = calculate.calculate(firstIntOperator, secondIntOperator, actionOperator);
            String resultString = ArabicToRoman.convertArabicToRoman(resultInt);
            System.out.println(firstOperator+" "+ actionOperator+" "+secondOperator+" = "+resultString);
        }else System.out.println("Chosen type of num is incorrect.\nTry once more.");

    }
}


