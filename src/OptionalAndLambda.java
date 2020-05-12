import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OptionalAndLambda {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);
        list.add(5);list.add(6);list.add(7);list.add(8);

        list.stream().reduce(0, Integer::sum);
        System.out.println(filterEven(list));

        List<String> strings = new ArrayList<>();
        strings.add("a");strings.add("b");strings.add("c");
        strings.add("a");strings.add("b");strings.add("a");

        System.out.println(equal(strings, "a"));
        System.out.println(list);
        int[] arr = {1, 2, 3, 4, 5};
        OptionalDouble res = Arrays.stream(arr).average();
        System.out.println(res.orElse(0.00));
        List<String> listint = List.of("HEllo", "JAva");
        System.out.println(listint.stream());
        // вернуть строку с символами уникальными
        String string = "ababababababababababa";
        System.out.println("ELEM" + listint.stream().map(x -> x.charAt(1)).collect(Collectors.toList()));
        string.chars().mapToObj(item -> (char)item).distinct().collect(Collectors.toList());
    }

    public static Integer filterEven (List<Integer> list) {
        return list.stream().filter(x -> !(x % 2 == 0)).reduce(0, Integer::sum);
    }

    public static int equal (List<String> elements, String element) {
        return (int) elements.stream().filter(str -> str.equals(element)).count();
    }

    /**
     * <p>5. Дана коллекция чисел List of Integer numbers (пример: Arrays.asList(6, 2, 3, 7, 2, 5))
     * Отнимите от каждого элемента, который стоит на непарной позиции (имеет не парный индекс) 1
     * и верните среднее арифметическое всех нечетных чисел или киньте ошибку
     * NoSuchElementException</p>
     **/
    public Double averageSumOdd(List<Integer> numbers) {
        return IntStream.range(0, numbers.size())
                .map(x -> (x % 2 == 1) ? numbers.get(x) - 1 : numbers.get(x))
                .filter(x -> !(x % 2 == 0))
                .average()
                .orElseThrow(NoSuchElementException::new);
    }


    /*
peopleList.stream().filter(p -> p.getSex()
                .equals(People.Sex.WOMEN) && p.getAge() > femaleAge)
                .map(People::getCatList)
                .flatMap(Collection::stream)
                .map(Cat::getName)
                .collect(Collectors.toList());
 */

    /**
     * <p>7. Дано коллекцию List of peoples. Класс People (с полями name — имя, age — возраст,
     * sex — пол, List of Cats -  кошки этого человека).
     * Дано класс Cat (name - имя кошки, age - возраст кошки).
     * Задача: вивести все имена кошек в которых хозяева это девушки старше 18 лет</p>
     **/
//    public List<String> getCatsNames(List<People> peopleList, int femaleAge) {
//        return peopleList.stream().filter(people -> people.getSex().equals(People.Sex.WOMEN)
//                && people.getAge() > femaleAge)
//                .map(People::getCatList)
//                .flatMap(Collection::stream)
//                .map(Cat::getName)
//                .collect(Collectors.toList());
//    }

}
