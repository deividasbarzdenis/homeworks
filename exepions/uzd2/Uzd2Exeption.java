package exepions.uzd2;

public class Uzd2Exeption {
    public static void main(String[] args) {
        Input input = new Input();

        int skaicius = input.sveikasSkaicius();
        System.out.println("Ivestas skaicius: " + skaicius);

    }
    /* 4. Paleiskite programą ir įveskite skaičių su slankuoju kableliu. gausite klaidą.
5. Apsaugokite programą nuo 'nulūžimo' - įvedus ne sveikąjį skaičių programa turi pranešti,
kad įvesti netinkami duomenys ir prašys įvesti skaičių dar kartą. Programa prašys įvesti
skaičių tol kol jį vartotojas įves teisingai.*/
}
