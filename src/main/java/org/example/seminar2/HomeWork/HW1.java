// Дана последовательность N целых чисел. Найти сумму простых чисел
package org.example.seminar2.HomeWork;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {

        System.out.println("Введите кол-во целых чисел последовательности: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Введите " + n + " целых числа: ");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            int num2 = scanner.nextInt();
            if (num2 % num != 0 && num2 % 2 != 0) {
                sum += num2;
            }
            num = num2;
        }
        scanner.close();
        System.out.println("Сумма простых цисел: " + sum);
    }
}
