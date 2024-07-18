import java.util.Scanner;

public class plaindormNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number to find plaindorm");
        int num = scanner.nextInt();
        int org =num;
        int plaindorm=0;
        while (num!=0){
            plaindorm = plaindorm *10 + num%10;
            num=num/10;
        }
        if (org==plaindorm){
            System.out.println("is plaindorm");}
        else {
        System.out.println("not plaindorm");}
    }
}
