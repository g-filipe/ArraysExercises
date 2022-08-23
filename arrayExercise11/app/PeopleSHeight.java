package arrayExercise11.app;

import arrayExercise11.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class PeopleSHeight {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be participating? ");
        int quantity = sc.nextInt();
        Person[] vector = new Person[quantity];

        for (int i = 0; i < vector.length; i++){
            System.out.println(i+1 +"º Person Data: ");
            System.out.print("Height: ");
            double height = sc.nextDouble();
            System.out.print("Gender (M/F): ");
            String gender = String.valueOf(sc.next().charAt(0)).toUpperCase();

            vector[i] = new Person(height, gender);
        }

        double theSmallestHeight = 4.0;
        double theHighestHeight = 0.0;
        double sumOfWomenSHeight = 0.0;
        int quantityOfWomen = 0;
        int quantityOfMen = 0;

        for (Person person : vector) {
            if (person.getHeight() < theSmallestHeight) {
                theSmallestHeight = person.getHeight();
            }

            if (person.getHeight() > theHighestHeight) {
                theHighestHeight = person.getHeight();
            }

            if (person.getGender().equals("F")) {
                sumOfWomenSHeight += person.getHeight();
                quantityOfWomen++;
            }

            if (person.getGender().equals("M")) {
                quantityOfMen++;
            }

        }

        double womenSHeightAvg = sumOfWomenSHeight / quantityOfWomen;

        System.out.printf("The smallest height: %.2f\n", theSmallestHeight);
        System.out.printf("The highest height: %.2f\n", theHighestHeight);
        System.out.printf("The Women's height average: %.2f\n", womenSHeightAvg);
        System.out.println("Quantity of Men: " + quantityOfMen);

        sc.close();
    }
}
