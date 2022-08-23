package arrayExercise3.app;

import arrayExercise3.entites.Person;

import java.util.Locale;
import java.util.Scanner;

public class PeopleData {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people are you gonna enter? ");
        int numberOfPeople = sc.nextInt();
        Person[] vector = new Person[numberOfPeople];

        for (int i = 0; i < vector.length; i++){
            System.out.println();
            System.out.println(i+1 + "º person data:");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Height: ");
            double height = sc.nextDouble();
            vector[i] = new Person(name, age, height);
        }
        double sumHeight = 0.0;
        double avgHeight;
        double lessThanSixteen = 0.0;

        for (Person person : vector) {

            sumHeight += person.getHeight();

            if (person.getAge() < 16) {
                lessThanSixteen += 1;
            }
        }

        double percentOfLessThanSixteen = lessThanSixteen / numberOfPeople * 100;
        avgHeight = sumHeight / numberOfPeople;

        System.out.println();
        System.out.printf("Average Height: %.2f\n", avgHeight);
        System.out.printf("People who have less than sixteen years old: %.1f%%\n", percentOfLessThanSixteen);
//
        for (Person person : vector){
            if(person.getAge() < 16){
                System.out.println(person.getName());
            }
        }

        sc.close();

    }
}
