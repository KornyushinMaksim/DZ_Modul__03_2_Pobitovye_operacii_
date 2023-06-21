//Задание 6
//        Обнулить все кроме последних i битов числа N. Вывести
//        результат на консоль в двоичном виде.

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Integer.toBinaryString(n));
        int i = scanner.nextInt();
        System.out.println(Integer.toBinaryString(n >> i << i));
    }
}
