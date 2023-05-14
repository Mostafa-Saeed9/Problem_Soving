import java.util.InputMismatchException;
import java.util.Scanner;

public class occurrency {
    public static void main(String[] args) {
        String text = "The good software engineer is someone that has strong technical skills and deep understanding " +
                "of topics ";
        String word = "is";

        // Method 1: Using split() method
        int countword = text.toLowerCase().split(word.toLowerCase()).length - 1;
        System.out.println("Using split() method: " + countword);

        // Method 2: Using For Loop
        String wordArray [] = text.split(" ");
        int count = 0;
        for (int i=0 ; i <= wordArray.length-1 ; i++){
            if (wordArray[i].equals(word))
                count++;
        }
        System.out.println("Using for Loop : " + count);

    }
}