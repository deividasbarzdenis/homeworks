package comparator.uzd1;

import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Uzd1Comparator {
    public static void main(String[] args) throws IOException {
        JavaStudentGroup js = new JavaStudentGroup();
        FileReader path = new FileReader("src/comparator/uzd1/people.txt");
        BufferedReader br = new BufferedReader(path);
        br.readLine();

        String line;
        while ((line = br.readLine()) !=null){
            String[] eilute = line.split(",");
            js.idetiSarasa(new Student(eilute[1].trim(),eilute[2].trim(),Integer.parseInt(eilute[0])));
        }
        br.close();

        System.out.println(js.list);
    }

}
