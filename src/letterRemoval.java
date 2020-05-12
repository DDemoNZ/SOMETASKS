public class letterRemoval {
    public static void main(String[] args) {
        System.out.println(doTest("abracadabra", 0));
        System.out.println(doTest("abracadabra",  1));//, "bracadabra");
        System.out.println(doTest("abracadabra",  2));//, "brcadabra");
        System.out.println(doTest("abracadabra",  6));//, "rcdbr");
        System.out.println(doTest("abracadabra",  8));//, "rdr");
        System.out.println(doTest("abracadabra", 50));//, "");
        System.out.println(doTest("hxehmvkybeklnj",  5));//, "xmvkyklnj");
        System.out.println(doTest("cccaabababaccbc", 3));//, "cccbbabaccbc");
        System.out.println(doTest("cccaabababaccbc", 9));   //, "cccccc");
        System.out.println(doTest("u", 1));// ""
        System.out.println(doTest("back", 3));//, "k");
    }

    public static String /*letterRemov*/ doTest (String s, int k) {

        char ch = 'a';
        for(int i = 0; i < k; i++) {
            while (!s.contains(ch + "")) ch++;
            s = s.replaceFirst(ch + "", "");
            if(s.length() == 0) break;
        }
        return s;


    }
}
