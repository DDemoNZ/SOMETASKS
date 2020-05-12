public class DrawRomb {

    public static void main(String[] args) {
        drawHromb(10);
    }

    public static void drawHromb(int num) {
        int middle = num / 2;
        int temp = (num % 2 == 1) ? 0 : 1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i < middle) {
                    if (j >= middle - i - temp && j <= middle + i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j >= i - middle && j <= middle - i + num - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
