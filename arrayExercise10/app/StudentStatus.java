package arrayExercise10.app;

import arrayExercise10.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class StudentStatus {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students are you gonna enter? ");
        int quantity = sc.nextInt();
        Person[] vector = new Person[quantity];

        for (int i = 0; i < vector.length; i++){
            System.out.println(i+1 +"º Student data: ");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Grade1: ");
            double grade1 = sc.nextDouble();
            System.out.print("Grade2: ");
            double grade2 = sc.nextDouble();
            vector[i] = new Person(name, grade1, grade2);
        }

        double avg;
        double minimumAvg = 6.0;
        System.out.println("Student Status: Passed");

        for (Person person : vector){
            avg = (person.getGrade1() + person.getGrade2())/2;
            if (avg >= minimumAvg){
                System.out.println(person.getName());
            }
        }

        sc.close();
    }
}
