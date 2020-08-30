package streamsAndLambdas.uzd1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("2");
        list.add("10");
        list.add("14");
        list.add("28");
        List<String> list2 = new ArrayList<>();
        list2.add("2");
        list2.add("28");
        list2.add("58");
        list2.add("78");
        list2.add("67");
        list2.add("69");
        List<String> combinedList = Stream.of(list, list2)
                .flatMap(Collection::stream)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        combinedList.forEach(System.out::println);
       /* List<String> sortedList = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);*/
    }

}
