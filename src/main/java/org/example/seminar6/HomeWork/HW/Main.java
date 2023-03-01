package org.example.seminar6.HomeWork.HW;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Notebook notebook1 = new Notebook(1, 8, 256, "Windows", "Black");
        Notebook notebook2 = new Notebook(2, 16, 512, "Linux", "Green");
        Notebook notebook3 = new Notebook(3, 32, 1024, "MacOS", "Black");
        Notebook notebook4 = new Notebook(4, 64, 256, "Windows", "Black");
        Notebook notebook5 = new Notebook(5, 128, 512, "MacOS", "Gold");
        Notebook notebook6 = new Notebook(6, 16, 1024, "Linux", "Grey");


        List<Notebook> notebooks = new ArrayList<>();
        List<Notebook> res;
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        notebooks.add(notebook6);


        while (true) {
            System.out.println(
                    """
                            Введите цифру, соответствующую необходимому критерию:\s
                            1 - ОЗУ\s
                            2 - Объем HD\s
                            3 - Операционная система\s
                            4 - Цвет\s""");
            int a = scanner.nextInt();

            switch (a) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Введите требуемый объем ОЗУ из доступных вариантов (8, 16, 32, 64 и 128 Gb): ");
                    int ram = scanner.nextInt();

                    System.out.println("\nСписок моделей ноутбуков с ОЗУ: " + ram + " Gb:\n");


                    res = Notebook.getNotebooksRam(notebooks, ram);
                    for (Notebook n : res) {
                        System.out.println(n.toString());
                    }
                    break;

                case 2:
                    scanner.nextLine();
                    System.out.println("Выберите объем HD из доступных вариантов (от 256, 512 и 1024 Gb): ");
                    int sizehdd = scanner.nextInt();
                    System.out.println("\nСписок моделей ноутбуков с объемом HDD " + sizehdd + " Gb:\n");
                    res = Notebook.getNotebooksHdd(notebooks, sizehdd);
                    for (Notebook n : res) {
                        System.out.println(n.toString());
                    }
                    break;

                case 3:
                    scanner.nextLine();
                    System.out.println("Выберите ОС из доступных вариантов (Linux, MacOS, Windows): ");
                    String os = scanner.nextLine();
                    System.out.println("\nСписок моделей ноутбуков c операционной системой: " + os + ":\n");
                    res = Notebook.getNotebooksOs(notebooks, os);
                    for (Notebook n : res) {
                        System.out.println(n.toString());
                    }
                    break;

                case 4:
                    scanner.nextLine();
                    System.out.println("Выберите цвет из доступных вариантов (Black, Green, Gold, Grey): ");
                    String col = scanner.nextLine();
                    System.out.println("\nСписок расцветки моделей ноутбуков  " + col + ":\n");
                    res = Notebook.getNotebooksColor(notebooks, col);
                    for (Notebook n : res) {
                        System.out.println(n.toString());
                    }
                    break;

                default:
                    System.out.println("Ошибка ввода! \n");
            }
            break;
        }
    }
}
