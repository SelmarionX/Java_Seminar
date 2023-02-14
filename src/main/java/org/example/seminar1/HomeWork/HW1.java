//Given an input string s, reverse the order of the words.

package org.example.seminar1.HomeWork;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        StringBuilder str1 = new StringBuilder();
        String[] a = str.split(" ");
        for (int i = a.length - 1; i >= 0; i--) {
            str1.append(a[i]).append(" ");
        }
        System.out.println(str1);
    }
}