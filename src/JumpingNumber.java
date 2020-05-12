import java.util.Arrays;
import java.util.stream.IntStream;

public class JumpingNumber {
    /*
    Explanation:
It's single-digit number
jumpingNumber(79) ==> return "Not!!"
Explanation:
Adjacent digits don't differ by 1
jumpingNumber(23) ==> return "Jumping!!"
Explanation:
Adjacent digits differ by 1
jumpingNumber(556847) ==> return "Not!!"
     */
    public static void main(String[] args) {
        System.out.println(jumpingNumber(235));
        System.out.println(jumpingNumber(45));
        double[] arr = {1, 1, 4, 1, 1, 1};
        String a = "5312";
        //a.contains("3");
        //Arrays.stream(arr).sorted().findFirst();
        int num = 17;

        String test = "abracadabra";
        int numtest = 6;
        char start = 'a';
        for (int i = 0; i <= numtest; i++) {
            if (!test.contains(String.valueOf(start))) {
                start++;
            }
            test = test.replaceFirst(String.valueOf(start), "");
        }
        System.out.println(test);

    }


    public static String jumpingNumber(int number)
    {
        String num = number + "";
        /*
        boolean allMatch​(Predicate predicate)
        Возвращает true, если все элементы стрима удовлетворяют условию predicate.
        Если встречается какой-либо элемент, для которого результат вызова функции-предиката будет false,
        то оператор перестаёт просматривать элементы и возвращает false.
         */
        return (IntStream.range(0, num.length() - 1).allMatch(i -> Math.abs(num.charAt(i) - num.charAt(i + 1)) == 1)) ? "Jumping!" : "Not!";
//
//        return (IntStream.range(0, num.length() - 1)
//                .allMatch(i -> Math.abs(num.charAt(i) - num.charAt(i + 1)) == 1)
//        ) ? "Jumping!!" : "Not!!";


    }

    public static double findUnique(double[] arr){
        Arrays.sort(arr);
        if (arr[0] == arr[1]) {
            return arr[arr.length - 1];
        }
        return arr[0];
    }
}


