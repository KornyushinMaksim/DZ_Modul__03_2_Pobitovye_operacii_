import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mask = 1;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(n & ~mask);
        System.out.println(Integer.toBinaryString(n & ~mask));
    }
}