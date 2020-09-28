package exepions.uzd4;

import java.util.ArrayList;
import java.util.List;

public class EmailSender {
    NetworkConnector nt = new NetworkConnector();
    private ArrayList<Email> notSend;

    public EmailSender() {
        this.notSend = new ArrayList<>();
    }

    public void sendEmail(List<Email> emails) throws InterruptedException {
        for (Email email : emails) {
            try {
                System.out.println("Siunciama adresu " + email.getKamSiunciama());
                nt.send(email);
                System.out.println("Laiskas sekmingai isiustas "+ email.getKamSiunciama());
            } catch (NoNetworkException e) {
                email.busena = Email.Busena.kartojamas;
                notSend.add(email);
            }
        }
        if (!notSend.isEmpty()){
            System.out.println("Yra neisiustu laisku");
            Thread.sleep(3000);
            ArrayList<Email> temp = (ArrayList<Email>) notSend.clone();
            notSend.clear();
            sendEmail(temp);
        }
    }
}
/*2. Sukurkite klasę EmailSender , kuri turi metodą sendEmail priimantį sąrašą laiškų. Metodas
iteruoja laiškus ir po vieną siunčia. Siuntimui kviečia klasės NetworkConnector metodą
send . Jei laiško išsiuntimas yra nesėkmingas (klaida NoNetworkException , kurios klasę taip
at reikia sukurti), tai reikia pakeisti laiško būseną į "kartojamas siuntimas". Tokius laišku
reikia pakartoti po 3 sekundžių. Thread.sleep(3000); - Java programa laukia 3 sekundes.
3. Klasės NetworkConnector metodas send turi veikti ne visada sėkmingai:*/
