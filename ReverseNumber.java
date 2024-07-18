import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number to revers");
        int num = scanner.nextInt();
        /*
//        first way
        int reverse = 0;
        while (num != 0){
            reverse = reverse*10 +num%10;
            num = num/10;
        }*/
       /*
       // second way
        StringBuffer reverse;
        StringBuffer buffer = new StringBuffer(String.valueOf(num));
        reverse = buffer.reverse();
        System.out.println("reversed number = " + reverse);
        */

       StringBuilder builder = new StringBuilder(String.valueOf(num));
       StringBuilder reverse = builder.reverse();
       System.out.println("reversed number = " + reverse);



    }
}
