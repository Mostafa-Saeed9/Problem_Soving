import java.util.Scanner;

public class CountEvenOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number to count even and odd digits");
        int num = scanner.nextInt();
        int evencount = 0;
        int oddcount = 0;
        while (num>0){
            if (num%2 ==0)
                evencount++;
            else
            oddcount++;
            num = num/10;
        }
        System.out.println("count EvenNumber = "+evencount+"  count OddNumber = "+oddcount);

    }
}
