//Задание 7
//        Определить значение i-го бита числа N.
//        Вывести результат на консоль в двоичном виде.

import java.util.Scanner;
public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Integer.toBinaryString(n));
        int i = scanner.nextInt();
        System.out.println(Integer.toBinaryString( (n & 1 << i) >> i));
        //System.out.println(Integer.toBinaryString( n >> 32 ));
    }
}
