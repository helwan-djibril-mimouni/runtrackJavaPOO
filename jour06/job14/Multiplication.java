package jour06.job14;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ok = false;
        while (!ok){
            System.out.println("Enter number between 1 and 9");
            int n = scanner.nextInt();
            if (n > 1 && n < 9) {
                ok = true;
                System.out.println("Table de multiplication de " + n + " :");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(n + " x " + i + " = " + (n * i));
                }
            }
        }
        scanner.close();
    }
}