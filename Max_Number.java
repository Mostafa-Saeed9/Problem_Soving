import java.util.Scanner;

public class Max_Number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num, max = 0, pos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i+1) + ": ");
            num = input.nextInt();

            if (num > max) {
                max = num;
                pos = i+1;
            }
        }
        System.out.println("max number is : "+max);
        System.out.println("position of max : "+pos);
    }
}
