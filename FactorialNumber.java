import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number to get factorial");
        int num = scanner.nextInt();
        int factorial=1;
        for (int i = 1; i <=num ; i++) {
            factorial = factorial * i;
        }
        System.out.println("factorial of "+num +" is "+factorial);

        int arr[] = {1,2,3,4,5,6};
        int sum=0;
        for (int value:arr) {
            sum = sum+value;
        }
//        for (int i = 0; i <arr.length ; i++) {
//            sum = sum+arr[i];
//        }
        System.out.println("sum is "+sum);

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]%2==0)
                System.out.println(arr[i]);
        }

    }
}
