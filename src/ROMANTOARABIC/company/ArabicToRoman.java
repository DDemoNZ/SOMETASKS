package ROMANTOARABIC.company;

public class ArabicToRoman {
    public static String convertArabicToRoman (int a){

        String res = "";

        while (a >= 1000) {
            res += "M";
            a -= 1000;
        }

        while (a >= 900) {
            res += "CM";
            a -= 900;
        }

        while (a >= 500) {
            res += "D";
            a -= 500;
        }

        while (a >= 400) {
            res += "CD";
            a -= 400;
        }

        while (a >= 100) {
            res += "C";
            a -= 100;
        }

        while (a >= 90) {
            res += "XC";
            a -= 90;
        }

        while (a >= 50) {
            res += "L";
            a -= 50;
        }

        while (a >= 40) {
            res += "XL";
            a -= 40;
        }

        while (a >= 10) {
            res += "X";
            a -= 10;
        }

        while (a >= 9) {
            res += "IX";
            a -= 9;
        }

        while (a >= 5) {
            res += "V";
            a -= 5;
        }

        while (a >= 4) {
            res += "IV";
            a -= 4;
        }

        while (a >= 1) {
            res += "I";
            a -= 1;
        }

        return res;
    }

}
