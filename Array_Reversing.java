import java.util.Scanner;

public class Array_Reversing {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int array[] = new int[10];

        System.out.println("Enter "+10+" elements ");
        for(int i=0; i < array.length; i++)
        {
            array[i] = s.nextInt();
        }
        System.out.println("Reverse of an array is :");
        for(int i=array.length-1;i>=0 ; i--)
        {
            System.out.println(array[i]);

        }
    }
}