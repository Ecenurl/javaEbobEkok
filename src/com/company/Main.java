package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int ebob;
        Scanner sc = new Scanner(System.in);
        System.out.print("1.Sayı: ");
        int n1 = sc.nextInt();
        System.out.print("2.Sayı: ");
        int n2 = sc.nextInt();
        int k = n1;
        int t = n2;
        int i = 1;

        if (n1 < n2) {
            while (k >= 1 || i <= (n1 * n2)) {
                if (n1 % k == 0 && n2 % k == 0) {
                    ebob = k;
                    System.out.println("EBOB"+ " " +ebob);
                    break;
                } else {
                    k--;
                }

            }

            while (i <= (n1 * n2)) {
                if (i % n1 == 0 && i % n2 == 0) {
                    System.out.println("EKOK" + " " +i);
                    break;
                } else {
                    i++;
                }
            }

        } else if (n1 > n2) {
            while (t >= 1) {
                if (n2 % t == 0 && n1 % t == 0) {
                    ebob = t;
                    System.out.println("EBOB"+ " " +ebob);
                    break;
                } else
                    t--;
            }
            while (i <= (n1 * n2)) {
                if (i % n1 == 0 && i % n2 == 0) {
                    System.out.println("EKOK" + " " +i);
                    break;
                } else {
                    i++;
                }
            }

        }
    }
}