import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Integer.toBinaryString(n));
        int i = scanner.nextInt();
        System.out.println(Integer.toBinaryString( n & 1 << i ));
        System.out.println(Integer.toBinaryString( n >> i));
    }
}
