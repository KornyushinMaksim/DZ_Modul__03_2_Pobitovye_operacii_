//Задание 11
//        Посчитать и вывести на консоль количество единичных битов в числе N.
//        Вывести на консоль исходное число в двоичном виде и результат.

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        System.out.println(Integer.toBinaryString(n));
        //дописать
        System.out.println("Результат: " );
    }
}
