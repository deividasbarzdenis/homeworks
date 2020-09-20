package files.uzd1;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Uzd1Files {
    public static void main(String[] args) throws IOException {

        addMoneyToAccount(readFilePeople(),readFilePayment());
    }

    private static List<Person> readFilePeople() throws IOException {
        List<Person> people = new ArrayList<>();
        BufferedReader br = new BufferedReader(
                new FileReader("src/main/java/streamsAndLambdas/uzd2/people.txt"));
        String line = null;
        line = br.readLine();
        while ((line = br.readLine()) != null) {
            String parts[] = line.split(", ");
            people.add(new Person(parts[0], parts[1], parts[2]));
        }
        br.close();
        return people;
    }

    private static Map<String, Person> convertListToMap(List<Person> personList) {
        Map<String, Person> mapIdToPerson = null;
        mapIdToPerson = personList.stream()
                .collect(Collectors.toMap(
                        Person::getId,
                        person -> person)
                );
        System.out.println(mapIdToPerson);
        return mapIdToPerson;
    }

    private static List<Payment> readFilePayment() throws IOException {
        List<Payment> payment = new ArrayList<>();
        File file = new File("src/main/java/Failai/uzd1/payment.txt");
        FileInputStream fis = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String line = null;
        line = br.readLine();
        while ((line = br.readLine()) != null) {
            String parts[] = line.split(", ");
            payment.add(new Payment(parts[0], parts[1],
                    parts[2], parts[3]));
        }
        br.close();
        return payment;
    }

    private static void addMoneyToAccount(List<Person> person, List<Payment> payment) {
        Iterator<Payment> pay = payment.iterator();
        for (Person per : person) {
            while (pay.hasNext()) {
                if (per.getId().equals(pay.next().getReceicerId())) {
                    per.setReceivedMoney(per.getReceivedMoney()+Double.parseDouble(pay.next().getSum()));
                }
                if (per.getId().equals(pay.next().getSenderId())) {
                    per.setSentMoney(per.getSentMoney()+Double.parseDouble(pay.next().getSum()));
                }
            }
        }

    }
}
