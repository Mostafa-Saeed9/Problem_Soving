package com.company;

import java.util.Scanner;

public class Squared_and_Cubic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i+ " " +i*i +" "+i*i*i);
        }

    }
}
