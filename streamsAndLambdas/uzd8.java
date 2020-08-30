package streamsAndLambdas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class uzd8 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alex", "Brian", "John");
        names.forEach(System.out::println);

        System.out.println("1-________________________________________");
        Consumer<String> makeUpperCase = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toUpperCase());
            }
        };
        names.forEach(makeUpperCase);

        System.out.println("2-________________________________________");
        Map<String , String > map = new HashMap<String ,String>();
        map.put("A","Alex");
        map.put("B","Grace");
        map.put("C","Mandy");
        map.forEach((k,v)->
                System.out.println("Key="+k+", Value="+v));

        System.out.println("3-________________________________________");
        List<Integer> numberList = Arrays.asList(2,6,3,1,7,8,2,5,9,0);
        Consumer<Integer> action = System.out::println;
        numberList.stream()
                .filter(n->n%2 == 0)
                .forEach(action);
        System.out.println("4-________________________________________");
        numberList.stream()
                .filter(n->n%2 ==0)
                .forEachOrdered(action);
    }
}
