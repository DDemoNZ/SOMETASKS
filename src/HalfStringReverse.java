public class HalfStringReverse {


    public static void main(String[] args) {
        String str = "Hello, mates. It's a string reverser.";
        char[] chars = str.toCharArray();
        for (int i = 0, j = chars.length - 1; i < chars.length / 2; i++, j--) {
            char temp = chars[i];
            System.out.println("temp = " + temp);
            chars[i] = chars[j];
            System.out.println("chars[" + i + "] = " + chars[i]);
            chars[j] = temp;
            System.out.println("chars[" + j + "] = " + chars[j]);
        }
        String s = String.valueOf(chars);
        System.out.println(s);
    }


}
