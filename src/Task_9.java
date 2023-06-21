//Задание 9
//        Определить имеют ли чисел M и N разные знаки.
//        Используя только побитовые и условные операторы.

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число m");
        int m = scanner.nextInt();
        System.out.println("Введите число n");
        int n = scanner.nextInt();
        System.out.println(((m >> 13 & 1) == (n >> 31 & 1)) ? "Числа с одинаковыми знаками" : "Числа с разными знаками");
    }
}
