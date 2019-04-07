package ru.geekbrains;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
import java.util.*;
public class HomeWork3 {
    private Scanner sc = new Scanner(System.in);

    private int menu() {
        System.out.println(" 1: Угадайка чисел.");
        System.out.println(" 2: Угадайка фруктов.");
        System.out.print(" 0: выход из программы:");
        return sc.nextInt();
    }

    public void main(String[] args) {
        int sel;
        do {
            sel = menu();
            switch (sel) {
                case 1: task1(); break;
                case 2: task2(); break;
                case 0: System.out.println("Николай Говорухин, homework 3"); break;
                default: System.out.println(" Неправильный выбор.");
            }
        } while (sel != 0);
    }

    private void task1() {
        int round;
        do	{
            int stp = 2;
            int rand = (int) (Math.random() * 10);
            System.out.print("Введите число от О до 9: ");
            int scan = sc.nextInt();
            while (scan != rand && stp < 4) {
                stp++;
                if (scan > rand) {
                    System.out.print("Загаданное число меньше: ");
                } else {
                    System.out.print("Загаданное число больше: ");
                }
                scan = sc.nextInt();
            }
            do {
                System.out.print("Играем ещё раз? 1 - Да ");
                round = sc.nextInt();
            } while (round > 1);
        } while (round != 1);
    }
    private void task2() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String scan, word = words [(int) (Math.random() * 25)];
        for (int i = 0; i < 15; i++) {
            System.out.print("#");
        }
        do {
            System.out.print(" Введите слово: ");
            scan = sc.nextLine();
            if (word.equals(scan)) {
                System.out.println("Вы угадали!");
            } else {
                int i = 1, l = word.length();
                if (l > scan.length()) {
                    l = scan.length();
                }
                if (word.charAt(0) == scan.charAt(0)) {
                    System.out.print(scan.charAt(0));
                } else {
                    System.out.print("#");
                }
                for (; i < l; i++) {
                    if (word.charAt(i) == scan.charAt(i)) {
                        System.out.print(scan.charAt(i));
                    }
                }
                for (; i < 15; i++) {
                    System.out.print('#');
                }
            }
        } while (!scan.equals(word));
    }
}