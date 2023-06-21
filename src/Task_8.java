//Задание 8
//        Обнулить крайний левый (старший разряд) единичный
//        бит числа N. Вывести результат на консоль в двоичном виде.

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        int mask = 1;
        if (n >= mask << 16) mask <<= 16;
        if (n >= mask << 8) mask <<= 8;
        if (n >= mask << 4) mask <<= 4;
        if (n >= mask << 2) mask <<= 2;
        if (n >= mask << 1) mask <<= 1;
        mask = ~mask;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(n & mask));
    }
}
