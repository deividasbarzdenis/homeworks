package streamsAndLambdas.uzd2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = null;
        String path = "src/streamsAndLambdas/uzd2/people.txt";

        try  {
            list = Files.lines(Paths.get(path))
                    .filter(line -> !line.startsWith("id"))
                    .map(l -> l.split(", ")[1])
                    .distinct()
                    .sorted()
                    .collect(Collectors.toList());


        } catch (IOException e) {
            e.printStackTrace();
        }

        assert list != null;
        list.forEach(System.out::println);
    }
}
