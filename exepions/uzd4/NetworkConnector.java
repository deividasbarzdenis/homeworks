package exepions.uzd4;

import java.util.Random;

public class NetworkConnector{

    public void send(Object o) throws NoNetworkException {
        Random rand = new Random();
        int n = rand.nextInt(10);
        try {
            int i = 1 / n;
        } catch (ArithmeticException e) {
            throw new NoNetworkException();
        }
    }
}


