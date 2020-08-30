package streamsAndLambdas.uzd6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> arrL= Arrays.asList(1,2,3,4,5,6,7,8,9);
        arrL.forEach(n-> System.out.print(n+" "));
        System.out.println("\n_____________________");
        arrL.forEach(n -> {
            if (n%2 == 0) System.out.println(n);
        });

    }
}
