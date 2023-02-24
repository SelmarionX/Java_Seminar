package org.example.seminar5.HomeWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом)
public class HW2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        String str = "Уж небо осенью дышало , уж реже солнышко блистало .";
        String[] masStr = str.toLowerCase().split(" ");

        System.out.print("Введите искомое слово: ");
        String inWord = scanner.next();
        inWord = inWord.toLowerCase();
        map.put(inWord, 0);
        for (String inNewStr : masStr) {
            if (map.containsKey(inNewStr)) {
                map.put(inWord, (map.get(inWord) + 1));
            }
        }
        for (var entry : map.entrySet()) {
            System.out.println("'" + entry.getKey() + "'" + " встретилось: " + entry.getValue() + " раз(а)");
        }
    }
}
