package maven.uzd2;

import com.github.pemistahl.lingua.api.*;

import static com.github.pemistahl.lingua.api.Language.*;

import java.util.Scanner;

public class Uzd2Maven {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println();
        aa:
        while (true) {
            printmenu();
            String choice = sc1.next();
            switch (choice){
                case "1":
                    System.out.println("Enter word:");
                    String word = sc.nextLine();
                    System.out.println("The word/sentence is written in "+detectLanguage(word));
                    break;
                case "2":
                    break aa;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }
    }

    private static Language detectLanguage(String word) {
        final LanguageDetector detector = LanguageDetectorBuilder
                .fromLanguages(ENGLISH, FRENCH, GERMAN, SPANISH).build();
        return detector.detectLanguageOf(word);
    }

    private static void printmenu() {
        System.out.println("[1]--Enter the word or sentence\n"
                + "[2]--exit");
    }

}
