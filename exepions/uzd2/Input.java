package exepions.uzd2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);

    public int sveikasSkaicius(){
        int skaicius = 0;
        aa:while (true) {
            try {

                System.out.println("Iveskite skaiciu:");
                skaicius = sc.nextByte();

                break aa;
            } catch (InputMismatchException e) {
                System.out.println("Ivestas blogas saicius");
                sc.next();
            }

        }
        return skaicius;
    }
}
