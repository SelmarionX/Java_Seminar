//Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
package org.example.seminar2.HomeWork;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во элементов в массиве: ");
        int n = scanner.nextInt();
        System.out.println("введите значения элементов в массиве: ");
        int[] massive = new int[n];
        int sumIndex = 0;
        for (int i = 0; i < n; i++) {
            massive[i] = scanner.nextInt();
            if (Math.abs(massive[i]) > 9 && Math.abs(massive[i]) < 100) {
                sumIndex += i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (massive[i] < 0) {
                massive[i] = sumIndex;
            }
            System.out.print(massive[i] + " ");
        }
    }
}
