import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = scanner.nextInt();
        System.out.println(Integer.toBinaryString(n));

        System.out.println(Integer.toBinaryString(n | 1 << i - 1));
    }
}
