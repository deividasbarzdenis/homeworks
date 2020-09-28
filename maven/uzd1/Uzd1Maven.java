package maven.uzd1;

import com.github.javafaker.Faker;

public class Uzd1Maven {

    public static void main(String[] args) {
        Faker faker = new Faker();
        for (int i = 1; i <= 100; i++) {
            System.out.println(i+"."+" Street: " + faker.address().streetAddress() + ", "
                    + "temperature: " + faker.weather().temperatureCelsius());
        }
    }
}


