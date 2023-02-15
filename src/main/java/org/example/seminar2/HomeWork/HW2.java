//Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
package org.example.seminar2.HomeWork;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во целых чисел последовательности: ");
        int n = scanner.nextInt();
        System.out.println("Введите " + n + " целых числа: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        {
            if (isSorted(arr)) {
                System.out.print("Введенная последовательность чисел ЯВЛЯЕТСЯ возрастающей");
            } else {
                System.out.print("Введенная последовательность чисел НЕ ЯВЛЯЕТСЯ возрастающей");
            }
        }
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] > arr[i + 1])) return false;
        }
        return true;
    }
}