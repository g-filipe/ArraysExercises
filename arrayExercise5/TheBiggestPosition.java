package arrayExercise5;

import java.util.Locale;
import java.util.Scanner;

public class TheBiggestPosition {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers are you gonna enter? ");
        int number = sc.nextInt();
        int[] vector = new int[number];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Enter a number: ");
            vector[i] = sc.nextInt();
        }

        double theBiggest = vector[0];
        int theBiggestPosition = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > theBiggest) {
                theBiggest = vector[i];
                theBiggestPosition = i;
            }
        }
        System.out.printf("\nTHE BIGGEST VALUE = %.1f", theBiggest);
        System.out.print("\nTHE BIGGEST POSITION = " + theBiggestPosition);

        sc.close();
    }
}
