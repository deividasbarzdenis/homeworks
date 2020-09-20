package files.uzd1;

public class Person {
    private String id;
    private String name;
    private String lastname;

    private double receivedMoney;
    private double sentMoney;


    public Person(String id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }

    public Person(String id, String name, String lastname, double receivedMoney, double sentMoney) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.receivedMoney = receivedMoney;
        this.sentMoney = sentMoney;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getReceivedMoney() {
        return receivedMoney;
    }

    public void setReceivedMoney(double receivedMoney) {
        this.receivedMoney = receivedMoney;
    }

    public double getSentMoney() {
        return sentMoney;
    }

    public void setSentMoney(double sentMoney) {
        this.sentMoney = sentMoney;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}