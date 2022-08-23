package arrayExercise7;

import java.util.Locale;
import java.util.Scanner;

public class BellowAverage {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values the vector will get? ");
        int number = sc.nextInt();

        double[] vector = new double[number];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Enter a number: ");
            vector[i] = sc.nextDouble();
        }

        double sum = 0.0;
        double vectorAverage = 0.0;

        for (double j : vector) {
            sum += j;
        }

        vectorAverage = sum / number;
        System.out.println();
        System.out.printf("VECTOR AVERAGE = %.3f", vectorAverage);
        System.out.println("\nBELLOW AVERAGE NUMBERS:");

        for (double v : vector) {
            if (v < vectorAverage) {
                System.out.printf("%.1f\n", v);
            }
        }

        sc.close();
    }
}
//        if(evenNumbers >0)
//
//    {
//        evenNumbersAvg = (double) sumOfEvenNumbers / evenNumbers;
//        System.out.printf("\nEVEN NUMBERS AVERAGE = %.1f", evenNumbersAvg);
//    } else
//
//    {
//        System.out.println("\nTHERE ISN´T ANY EVEN NUMBER IN THIS VECTOR!");
//    }



