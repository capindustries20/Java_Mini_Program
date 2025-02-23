package org.example;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr = new int[2][2];
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
                arr[i][j] = sc.nextInt();
        }
        int sum = 0;
        for (int i=0;i<2;i++)
            sum += arr[i][i];
        System.out.println(sum);
    }
}
