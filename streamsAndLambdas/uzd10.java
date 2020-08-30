package streamsAndLambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class uzd10 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add(i);
        }
        //create a parallel stream
        Stream<Integer> stream = list.parallelStream();
        List<Integer> evenNumberArr = stream
        .filter(i-> i%2==0)
        .collect(Collectors.toList());
        System.out.println(evenNumberArr);
    }
}
