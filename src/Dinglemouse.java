import java.util.Arrays;

public class Dinglemouse {
    public static void main(String[] args) {
       // System.out.println(tenGreenBottles(2));

        int i = 123455678;
       // System.out.println(String.format("%, ,", i));


        String bottle = "bottle hello world hi settings";
        String res = Arrays.stream(bottle.split(" ")).min(String::compareTo).get();
        System.out.println(res);
    }

    public static String tenGreenBottles(int n) {
        // Your code here
        String[] bottles = {"no", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        StringBuilder sb = new StringBuilder();
        String bottle = "bottles";

        for (int i = n; i > 1; i--) {
            sb.append(bottles[i] + " green bottles hanging on the wall,\n");
            sb.append(bottles[i] + " green bottles hanging on the wall,\n");

            sb.append("And if one green bottle should accidentally fall,\n");
            if (bottles[i].equals("Two")) bottle = "bottle";
            sb.append("There'll be " + bottles[i - 1].toLowerCase() + " green " + bottle + " hanging on the wall.\n" + "\n");


//                  "One green bottle hanging on the wall,\n"+
//                  "One green bottle hanging on the wall,\n"+
//                  "If that one green bottle should accidentally fall,\n"+
//                  "There'll be no green bottles hanging on the wall.\n";
        }
        sb.append(bottles[1] + " green bottles hanging on the wall,\n");
        sb.append(bottles[1] + " green bottles hanging on the wall,\n");

        sb.append("And if that one green bottle should accidentally fall,\n");
        sb.append("There'll be " + bottles[0] + " green bottles hanging on the wall.\n");

        return sb.toString();
    }

}
