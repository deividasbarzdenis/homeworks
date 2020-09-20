package files.uzd1;

public class Payment {
    private String id;
    private String   sum;
    private String  receicerId;
    private String   senderId;

    public Payment(String id, String sum, String receicerId, String senderId) {
        this.id = id;
        this.sum = sum;
        this.receicerId = receicerId;
        this.senderId = senderId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getReceicerId() {
        return receicerId;
    }

    public void setReceicerId(String receicerId) {
        this.receicerId = receicerId;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id='" + id + '\'' +
                ", sum='" + sum + '\'' +
                ", receicerId='" + receicerId + '\'' +
                ", senderId='" + senderId + '\'' +
                '}';
    }
    /*id, suma, gavejo id, siuntejo id*/
}
