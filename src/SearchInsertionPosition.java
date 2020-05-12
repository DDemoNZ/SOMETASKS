public class SearchInsertionPosition {

    public static int searchPosition(int[] arr, int target) {
        //TODO Binary search
        int start, end, mid;
        start = 0;
        end = arr.length;

        while (start <= end) {
            mid = (start + end) / 2;
            if (mid >= arr.length) {
                return arr.length;
            }
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return start;
    }















    public static int binSearch(int[] arr, int target) {

        int start, end, mid;
        start = 0;
        end = arr.length;
        while (start <= end) {
            mid = (start + end) / 2;
            if (mid == arr.length) {
                return arr.length;
            }
            if (arr[mid] == target) {
                return mid;
            }else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return start;
    }


}
