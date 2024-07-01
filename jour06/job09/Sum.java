package jour06.job09;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = scanner.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i * i;
        }
        System.out.println("Sum of " + n + " first numbers cubed : " + sum);
        scanner.close();
    }    
}