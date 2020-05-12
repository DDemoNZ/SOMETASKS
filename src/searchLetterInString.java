import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class searchLetterInString {
    public static void main(String[] args) {
        String ss = "Hello, World! World World!";
        ss.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetter)
                .collect(Collectors.groupingBy(Character::isLowerCase, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println();
        List<String> list = new ArrayList<>();
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        String str = "Hello, World! World World!";
        System.out.println(search(str, "W"));
        System.out.println(search(str, "d"));
        System.out.println(search(str, "x"));

        System.out.println(searchAllLetter(str));
        searchAllLetter2(str);
    }

    public static String search(String str, String letter) {
        String[] arr = str.replaceAll("[^a-z]+", "").split("");

        List<Character> list = new ArrayList<>();
        return letter + " " + (int)Stream.of(arr).filter(x -> x.equals(letter)).count();
    }

    public static String searchAllLetter(String str) {
        String[] arr = str.replaceAll("[^a-z]+", "").split("");
        Set<String> hashset = new HashSet<>(Arrays.asList(arr));
        StringBuilder sb = new StringBuilder();
        for (String s:hashset) {
            sb.append(s)
                    .append(" ")
                    .append(Stream.of(arr)
                            .filter(x -> x.equals(s))
                            .count())
                    .append(" times.\n");
        }
        return sb.toString();
    }

    public static void searchAllLetter2(String str) {
        String[] arr = str.replaceAll("[^a-z]+", "").split("");
        str.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetter)
                .collect(Collectors.groupingBy(Character::isLowerCase, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + ": " + v));

    }
}
