//Вывести список на экран в перевернутом виде (без массивов и ArrayList)
//Пример: 1 -> 2->3->4
//Вывод: 4->3->2->1
package org.example.seminar4.HomeWork;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите список: ");
        String st = scanner.nextLine();
        StringBuilder stB = new StringBuilder();
        stB.append(st);
        stB.reverse();
        System.out.println(stB);
    }
}



