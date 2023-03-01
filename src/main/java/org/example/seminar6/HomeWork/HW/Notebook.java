package org.example.seminar6.HomeWork.HW;

import java.util.ArrayList;
import java.util.List;


public class Notebook {

    int id, RAM, HDD;
    String OS, color;

    public Notebook(int id, int RAM, int HDD, String OS, String color) {
        this.id = id;
        this.RAM = RAM;
        this.HDD = HDD;
        this.OS = OS;
        this.color = color;
    }


    public String toString() {
        return "Модель №: " + id + "\n" +
                "ОЗУ: " + RAM + "\n" +
                "Объем HDD: " + HDD + "\n" +
                "ОС: " + OS + "\n" +
                "Цвет: " + color + "\n";
    }


    public static List<Notebook> getNotebooksRam(List<Notebook> notebooks, int size) {
        List<Notebook> result = new ArrayList<>();
        for (Notebook c : notebooks) {
            if ((c.RAM == size)) {
                result.add(c);
            }
        }
        return result;
    }


    public static List<Notebook> getNotebooksHdd(List<Notebook> notebooks, int sizehdd) {
        List<Notebook> result = new ArrayList<>();
        for (Notebook c : notebooks) {
            if ((c.HDD == sizehdd)) {
                result.add(c);
            }
        }
        return result;
    }


    public static List<Notebook> getNotebooksOs(List<Notebook> notebooks, String os) {
        List<Notebook> result = new ArrayList<>();
        for (Notebook c : notebooks) {
            if (c.OS.equalsIgnoreCase(os)) {
                result.add(c);
            }
        }
        return result;
    }

    public static List<Notebook> getNotebooksColor(List<Notebook> notebooks, String color) {
        List<Notebook> result = new ArrayList<>();
        for (Notebook c : notebooks) {
            if (c.color.equalsIgnoreCase(color)) {
                result.add(c);
            }
        }
        return result;
    }
}
