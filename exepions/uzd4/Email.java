package exepions.uzd4;


public class Email {
    enum Busena {
        naujas,
        issiustas,
        kartojamas,
        siuntimas;
    }

    private String laiskoTurinis, tema, kamSiunciama;
    Busena busena;

    public Email(String laiskoTurinis, String tema, String kamSiunciama) {
        this.laiskoTurinis = laiskoTurinis;
        this.tema = tema;
        this.kamSiunciama = kamSiunciama;
    }

    public String getLaiskoTurinis() {
        return laiskoTurinis;
    }

    public void setLaiskoTurinis(String laiskoTurinis) {
        this.laiskoTurinis = laiskoTurinis;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getKamSiunciama() {
        return kamSiunciama;
    }

    public void setKamSiunciama(String kamSiunciama) {
        this.kamSiunciama = kamSiunciama;
    }

    public Busena getBusena() {
        return busena;
    }

    public void setBusena(Busena busena) {
        this.busena = busena;
    }
}
/*Sukurkite klasę Email , kuri turi laisko turinį, temą, informaciją kam siunciama ir būseną
(naujas, issiustas, kartojamas siuntimas).
2. Sukurkite klasę EmailSender , kuri turi metodą sendEmail priimantį sąrašą laiškų. Metodas
iteruoja laiškus ir po vieną siunčia. Siuntimui kviečia klasės NetworkConnector metodą
send . Jei laiško išsiuntimas yra nesėkmingas (klaida NoNetworkException , kurios klasę taip*/
