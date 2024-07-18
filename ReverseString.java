import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter String to revers");

        String s = scanner.next();
        String reversed="";
//        for (int i=s.length()-1 ; i >=0;i--){
//            reversed = reversed + s.charAt(i);
//        }

        char arr[] = s.toCharArray();
        for (int i=arr.length-1 ; i>=0 ; i--){
            reversed = reversed + arr[i];
        }
        System.out.println("reversed String = " + reversed);

//        can used StringBuffer or String Builder to reverse
    }
}
