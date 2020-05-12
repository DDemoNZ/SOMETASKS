import java.util.Arrays;

public class SuperPow {

    public static int superPow(int a, int[] b) {
        StringBuilder sb = new StringBuilder();
        int step = 0;
        int res = a;
        for (int x:b) {
            step = step * 10 + x;
        }
        if (step == 0) {
            return 1;
        }
        for (int i = 0; i < step - 1; i++) {
            res *= a;
        }
        return res;
    }

}
