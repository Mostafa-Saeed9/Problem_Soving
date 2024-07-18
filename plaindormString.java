import java.util.Scanner;

public class plaindormString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter String to find plaindorm");
        String str = scanner.next();
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)){
           System.out.println(str + " is plaindorm");}
        else {
        System.out.println(str + " is not plaindorm");}
    }
}
