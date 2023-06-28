//Задание 11
//        Посчитать и вывести на консоль количество единичных битов в числе N.
//        Вывести на консоль исходное число в двоичном виде и результат.

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int count = 0;
        int mask = 1;

        System.out.println(Integer.toBinaryString(n));

        for (int i = 0; i < 31; i++){
            if ((n >> i & mask) == 1) {
                count++;
            }
        }
        System.out.println("Результат: " + count);
    }
}
