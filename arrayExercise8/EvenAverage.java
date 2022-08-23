package arrayExercise8;

import java.util.Locale;
import java.util.Scanner;

public class EvenAverage {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values the vector will get? ");
        int number = sc.nextInt();

        int[] vector = new int[number];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Enter a number: ");
            vector[i] = sc.nextInt();
        }

        double sum = 0.0;
        double evenNumbersAverage = 0.0;
        int totalOfEvenNumbers = 0;

        for (double j : vector) {
            if (j % 2 == 0) {
                sum += j;
                totalOfEvenNumbers++;
            }
        }

        evenNumbersAverage = sum / totalOfEvenNumbers;
        System.out.println();
        if (totalOfEvenNumbers != 0) {
            System.out.printf("EVEN NUMBER AVERAGE = %.1f", evenNumbersAverage);
        } else {
            System.out.println("There isn't any even number in this vector!");
        }

        sc.close();
    }
}
