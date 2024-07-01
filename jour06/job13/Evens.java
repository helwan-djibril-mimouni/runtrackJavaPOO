package jour06.job13;

import java.util.Scanner;

public class Evens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = scanner.nextInt();
        System.out.println("Even numbers before " + n + " :");
        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }
        scanner.close();
    }
}