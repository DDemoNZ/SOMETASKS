public class PowXatN {

    public static double myPow(double x, int n) {
        return Math.pow(x, n);
    }
//
//    public static double myPow(double x, int n) {
//        if (n == 0) {
//            return 1.0;
//        }
//        double res = x;
//        if (n < 0) {
//            for (int i = 0; i < n * -1 - 1; i++) {
//                res *= x;
//            }
//            return 1 / res;
//        } else {
//            for (int i = 0; i < n - 1; i++) {
//                res *= x;
//            }
//            return res;
//        }
//    }

}
