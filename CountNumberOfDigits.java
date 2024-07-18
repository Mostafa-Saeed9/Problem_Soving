import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number to count its digits");
        int num = scanner.nextInt();
        int count =0;
        while (num > 0){
            count ++;
            num = num/10;
        }
        System.out.println("count is : "+count);
    }
}
