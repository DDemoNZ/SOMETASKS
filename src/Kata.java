class Kata {
    public static String findScreenHeight(int width, String ratio) {
        String[] r = ratio.split(":");
        return r.length == 0 ? "" : width + "x" + width / Integer.parseInt(r[0]) * Integer.parseInt(r[1]);
    }

    public static String test() {
        int a = 5;
        int b = a++;
        int c = ++b;
        int d = ++c;
        return "a:" + a + " b:" + b + " c:" + c + " d:" + d;
    }

    public static void main(String[] args) {
        System.out.println(findScreenHeight(15, "4:3"));
        System.out.println(test());
    }
}
