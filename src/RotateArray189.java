import java.util.Arrays;

public class RotateArray189 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    //k - steps
    //dont work correctly when shift is bigger then array length
    public static void rotateIncorrect(int[] array, int shift) {
        int[] copy = Arrays.copyOf(array, shift);
        System.arraycopy(array, shift, array, 0, array.length - shift);
        System.arraycopy(copy, 0, array, array.length - shift, shift);
    }

    public static void rotate(int[] array, int shift) {

        int temp;

        for (int i = 0; i < shift; i++) {
            temp = array[0];

        }

    }

}
