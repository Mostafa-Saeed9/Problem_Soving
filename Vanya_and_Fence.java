import java.util.Scanner;

//problem link : https://codeforces.com/contest/677/problem/A
public class Vanya_and_Fence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("entre number of friends ");
        int n = input.nextInt();
        System.out.println("entre hight of friends ");
        int h = input.nextInt();

        int totalWidth = 0;

        for (int i = 0; i < n; i++) {
            int height = input.nextInt();
            if (height > h) {
                totalWidth += 2;  // Friend is taller than the fence
            } else {
                totalWidth += 1;  // Friend is shorter than or equal to the fence
            }
        }

        System.out.println(totalWidth);
        input.close();
    }
}


