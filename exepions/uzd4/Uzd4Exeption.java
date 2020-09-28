package exepions.uzd4;

import java.util.ArrayList;
import java.util.List;

public class Uzd4Exeption {
    public static void main(String[] args) throws InterruptedException {
        EmailSender emailSender = new EmailSender();
        List<Email> emails = new ArrayList<>();
        emails.add(new Email("aaa@aaa.lt", "subject1", "body1"));
        emails.add(new Email("bbb@bbb.lt", "subject2", "body2"));
        emails.add(new Email("ccc@ccc.lt", "subject3", "body3"));
        emails.add(new Email("ddd@ddd.lt", "subject4", "body4"));
        emails.add(new Email("eee@eee.lt", "subject5", "body5"));
        emailSender.sendEmail(emails);
    }
}
