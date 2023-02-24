package org.example.seminar5.HomeWork;
//Подсчитать количество вхождения каждого слова
//Пример:
//Россия идет вперед всей планеты. Планета — это не Россия.
//toLoverCase().

import java.util.HashMap;
import java.util.Map;

public class HW1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String str = "Россия идет вперед всей планеты . Планета — это не Россия .";
        String[] newStr = str.toLowerCase().split(" ");

        for (String inNewStr : newStr) {
            map.putIfAbsent(inNewStr, 0);
            map.put(inNewStr, (map.get(inNewStr) + 1));
        }
        for (var entry : map.entrySet()) {
            System.out.println("'" + entry.getKey() + "'" + " встретилось: " + entry.getValue() + " раз(а)");
        }
    }
}
