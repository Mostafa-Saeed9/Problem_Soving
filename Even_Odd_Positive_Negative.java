import java.util.Scanner;

public class Even_Odd_Positive_Negative {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num, evenCount = 0, oddCount = 0, positiveCount = 0, negativeCount = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter integer " + i + ": ");
            num = input.nextInt();

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
    }
}