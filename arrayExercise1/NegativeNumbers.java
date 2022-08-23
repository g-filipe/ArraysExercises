package arrayExercise1;

import java.util.Scanner;

public class NegativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers are you gonna enter? ");
        int number = sc.nextInt();
        int[] vector = new int[number];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Enter a number: ");
            vector[i] = sc.nextInt();
        }

        System.out.println("NEGATIVE NUMBERS:");
        for (int i : vector) {
            if (i < 0) {
                System.out.println(i);
            }

        }
        sc.close();
    }
}
