/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sumofdigits;

import java.util.Scanner;

/**
 *
 * @author Islam Mohamed
 */
public class SumOfDigits {

    public static void main(String[] args) {
        int N;
        int A, B, mx, mn;
        int sum = 0, sum2;
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        A = scan.nextInt();
        B = scan.nextInt();
        mx = Math.max(A, B);
        mn = Math.min(A, B);
        for (int i = 1; i <= N; i++) {
            sum2 = 0;
            int j = i;
            while (j != 0) {
                sum2 += j % 10;
                j /= 10;
                
            }
            if (sum2 >= mn && sum2 <= mx) {
                sum+= i;
            }
        }
        System.out.println(sum);

    }
}
