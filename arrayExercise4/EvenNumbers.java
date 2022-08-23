package arrayExercise4;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers are you gonna enter? ");
        int number = sc.nextInt();
        int[] vector = new int[number];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Enter a number: ");
            vector[i] = sc.nextInt();
        }

        int totalOfEvenNumbers = 0;

        System.out.println("\nEVEN NUMBERS: ");
        for (int i : vector) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                totalOfEvenNumbers++;
            }
        }

        System.out.print("\n\nTOTAL OF EVEN NUMBERS = " + totalOfEvenNumbers);

        sc.close();
    }
}
