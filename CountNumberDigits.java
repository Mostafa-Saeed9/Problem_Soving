import java.util.Random;
import java.util.Scanner;

public class CountNumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter numberto sum its digits");
        int num = scanner.nextInt();
        int sum=0;
        while (num > 0){
            sum = sum + num%10;
            num = num/10;
        }
        System.out.println("sum is : "+ sum);

//        Random random = new Random();
//        System.out.println(random.nextInt(10));

    }
}
