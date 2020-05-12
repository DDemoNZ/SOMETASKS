public class ArrayAndStringReverse {

    public static void main(String[] args) {
        String[] arr = {"I", "like", "big", "butts", "and", "I", "cannot", "lie!"};
        String a = new StringBuilder(String.join(" ", arr)).reverse().toString();
        String b = String.join(" ", arr);
        System.out.println(a);
        System.out.println(b);
        StringBuilder sb = new StringBuilder();

        int pointer = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length(); j++) {
                sb.append(a, pointer, pointer + arr[i].length()).append(" ");
                System.out.println(sb.toString());
                pointer+=arr[i].length();
            }
        }

        System.out.println(sb.toString());
    }
}
