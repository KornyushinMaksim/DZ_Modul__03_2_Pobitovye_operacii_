//Задание 10
//        Найти и вывести на консоль минимальное из двух чисел
//        M и N, используя только побитовые операции.

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число m: ");
        int m = scanner.nextInt();
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        System.out.println(m & ((m-n) >> 31) | n & (~(m-n) >> 31));
    }
}
