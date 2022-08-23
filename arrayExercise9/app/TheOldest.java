package arrayExercise9.app;

import arrayExercise9.entities.Person;

import java.util.Scanner;

public class TheOldest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will participate? ");
        int number = sc.nextInt();

        Person[] vector = new Person[number];

        for (int i = 0; i < vector.length; i++) {
            System.out.println(i + 1 + "º Person Data: ");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            vector[i] = new Person(name, age);
        }

        int theOldest = 0;
        String theOldestPeople = "";

        for (Person person : vector) {
            if (person.getAge() > theOldest) {
                theOldest = person.getAge();
                theOldestPeople = person.getName();
            }
        }

        System.out.println();
        System.out.println("The Oldest people:");
        System.out.println("Name: " + theOldestPeople);
        System.out.println("Age: " + theOldest);

        sc.close();
    }
}

