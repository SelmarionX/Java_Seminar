//Дана последовательность целых чисел, оканчивающаяся нулем.
// Найти сумму положительных чисел, после которых следует отрицательное число.
//Пример: 1 2 1 2 -1 1 3 1 3 -1 0
//2 -1 переход - 2 в сумму
//3 -1 переход 3 в сумму
//суммарно выведет 5

package org.example.seminar1.HomeWork;


import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 1, 2, -1, 1, 3, 1, 3, -1, 0};
        int summa = 0;
        System.out.print("Последовательность чисел равна: ");
        for (int i = 0; i < myArray.length; i++)
            System.out.print(myArray[i] + " ");
        for (int i = 0; i < myArray.length - 2; i++) {
            if (myArray[i] > 0 & myArray[i + 1] < 0) {
                summa += myArray[i];
            }
        }
        System.out.printf("\nСумма положительных чисел, после которых следует отрицательное число: %s", summa);
    }

}

