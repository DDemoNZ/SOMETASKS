import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReturnListOfMapInDescending {

    public static List<String> getList(final Map<String, Integer> languages) {
        List<String> collect =
                languages.entrySet().stream()
                        .filter(entry -> entry.getValue() >= 60)
                        .sorted((a, b) -> b.getValue() - a.getValue())
                        .map(entry -> entry.getKey())
                .collect(Collectors.toList());

//        List<String> collect =
//                languages.entrySet().stream()
//                        .filter(entry -> entry.getValue() >= 60)
//                        .sorted(Comparator.comparingInt(stringIntegerEntry -> stringIntegerEntry.getValue()))
//                        .map(e -> e.getKey())
//                        .sorted()
//                        .collect(Collectors.toList());


//                languages.entrySet().stream().sorted(Comparator.).map(e -> e.getKey()).collect(Collectors.toList());
//        Collections.reverse(collect);
        return collect;
    }

}
