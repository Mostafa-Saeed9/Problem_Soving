import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter point 1 (x1,y1)");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Enter point 2 (x2,y2)");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double Destance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Destance is = "+ Destance);


    }
    }

