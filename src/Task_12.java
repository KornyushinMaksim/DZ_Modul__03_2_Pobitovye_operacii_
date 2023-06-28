//Задание 12
//        Проверить, есть ли в двоичной записи числа n хотя бы один 0.
//        Используя только побитовые и условные операторы.
//        Вывести на консоль исходное число в двоичном виде и результат.

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int i;

        System.out.println(Integer.toBinaryString(n));

        for (i = 31; i >= 0; i--){
            if ((n >> i & 1) == 1) break;
        }
        for (int j = i; j >= 0; j--){
            if ((n >> j & 1) == 0) {
                System.out.println("в двоичной записи числа " + n +
                        " есть хотя бы один 0 на позиции " + j);
                break;
            }
        }
        if (n == 0) System.out.println("Число содержит нуль, т.к. оно само является нулём");
    }
}