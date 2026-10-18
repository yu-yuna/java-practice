package pr_13;

import java.util.StringTokenizer;

public class Address {

    String country;
    String region;
    String city;
    String street;
    String house;
    String building;
    String apartment;

    // Вариант 1: ,
    public void parseBySplit(String address) {

        String[] parts = address.split(",");

        country = parts[0].trim();
        region = parts[1].trim();
        city = parts[2].trim();
        street = parts[3].trim();
        house = parts[4].trim();
        building = parts[5].trim();
        apartment = parts[6].trim();
    }

    // Вариант 2: , . ;
    public void parseByTokenizer(String address) {

        StringTokenizer tokenizer =
                new StringTokenizer(address, ",.;");

        country = tokenizer.nextToken().trim();
        region = tokenizer.nextToken().trim();
        city = tokenizer.nextToken().trim();
        street = tokenizer.nextToken().trim();
        house = tokenizer.nextToken().trim();
        building = tokenizer.nextToken().trim();
        apartment = tokenizer.nextToken().trim();
    }

    @Override
    public String toString() {

        return "Страна: " + country +
                "\nРегион: " + region +
                "\nГород: " + city +
                "\nУлица: " + street +
                "\nДом: " + house +
                "\nКорпус: " + building +
                "\nКвартира: " + apartment;
    }
}