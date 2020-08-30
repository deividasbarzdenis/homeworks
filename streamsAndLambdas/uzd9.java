package streamsAndLambdas;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class uzd9 {
    public static void main(String[] args) {
        //stream created from array
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9,0,11,23,55,89,65,43);
        stream.forEach(System.out::print);
        System.out.println("\n1:______________________________________________");
        //stream create from List
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<10;i++){
            list.add(i);
        }
        Stream<Integer> stream1 = list.stream();
        stream1.forEach(System.out::println);
        System.out.println("2:______________________________________________");

        Stream<Integer> stream2 = Stream
                .generate(()-> (new Random()).nextInt(100));
        stream2.limit(20)
                .forEach(System.out::println);
        System.out.println("3:______________________________________________");

        Stream<String> stringStream = Stream.of("A$B$".split("\\$"));
        stringStream.forEach(System.out::println);

        System.out.println("4:______________________________________________");
        //collect to List
        List<Integer> list1 = new ArrayList<>();
        for (int i=0; i<20; i++){
            list1.add(i);
        }
        Stream<Integer> integerStream = list1.stream();
        List<Integer> evenNumberList = integerStream.filter(i->i%2==0)
                .collect(Collectors.toList());
        System.out.println(evenNumberList);
        //collect to Array
     /*   Integer[] evenNumberArray = integerStream.filter(i->i%2==0)
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(evenNumberArray));*/

        System.out.println("5:______________________________________________");
        List<String> membersNames = new ArrayList<>();
        membersNames.add("Ami");
        membersNames.add("Shert");
        membersNames.add("Rahuik");
        membersNames.add("Todo");
        membersNames.add("Boko");
        membersNames.add("Lako");

        membersNames.stream()
                .filter((s)->s.startsWith("A"))
                .forEach(System.out::println);

        System.out.println("6:______________________________________________");
        membersNames.stream()
                .filter((s)->s.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("7:______________________________________________");
        //sorted in natural order
        membersNames.stream()
                .sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("8:______________________________________________");
        boolean matchResult = membersNames.stream()
                .anyMatch((s)->s.startsWith("A"));
        System.out.println(matchResult);

        matchResult = membersNames.stream()
                .allMatch((s)->s.startsWith("A"));
        System.out.println(matchResult);

        matchResult = membersNames.stream()
                .noneMatch((s)->s.startsWith("A"));
        System.out.println(matchResult);

        System.out.println("9:______________________________________________");
        long totalmatched = membersNames.stream()
                .filter((s)->s.startsWith("A"))
                .count();
        System.out.println(totalmatched);

        System.out.println("10:______________________________________________");
        Optional<String> reduced = membersNames.stream()
                .reduce((s1,s2)->s1+'#'+s2);
        reduced.ifPresent(System.out::println);

        System.out.println("11:______________________________________________");
        boolean match = membersNames.stream()
                .anyMatch((s)->s.startsWith("A"));
        System.out.println(match);

        System.out.println("12:______________________________________________");
        String firstMatchedName = membersNames.stream()
                .filter((s)->s.startsWith("L"))
                .findFirst()
                .get();
        System.out.println(firstMatchedName);

        System.out.println("13:______________________________________________");

    }
}
