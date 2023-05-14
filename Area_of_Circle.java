import java.util.Scanner;

public class Area_of_Circle {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        float n = 3.14159f;
        int ReadValue = Scanner.nextInt();
        float Area = (float) (n * Math.pow(ReadValue , 2));
        System.out.println("Area = "+Area);
    }
}