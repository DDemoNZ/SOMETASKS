public class SpecialNumberAllNumInNumberAreFrom0to5
{
    public static void main(String[] args) {


        int a = 53532;
        int counter = 0;
        while (a > 0) {
            if (a % 10 > 5) {
                counter++;
            }
            a /= 10;
        }
        System.out.println(counter);

        System.out.println(specialNumber(53532));
        System.out.println(specialNumber(970569));
        System.out.println(specialNumber(11350224));
    }

//    public static String specialNumber(int number)
//    {
//        String[] check = String.valueOf(number).split("");
//        String[] arr = {"0", "1", "2", "3", "4", "5"};
//        int counter = 0;
//        for (int i = 0; i < check.length; i++) {
//          for (String x : arr) {
//            if (check[i].equals(x)) {
//              counter++;
//            }
//          }
//        }
//        return counter == check.length ? "Special!!" : "NOT!!";
//    }
    public static String specialNumber(int number) {
        while (number != 0) {
            if (number % 10 > 5) {
                return "NOT!!";
            }
            number /= 10;
        }
        return "Special!!";
    }
}
