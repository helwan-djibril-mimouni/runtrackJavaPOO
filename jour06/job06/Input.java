package jour06.job06;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number :");
        double n1 = scanner.nextDouble();
        System.out.println("Enter second number :");
        double n2 = scanner.nextDouble();
        System.out.println("Enter third number :");
        double n3 = scanner.nextDouble();
        double max = Math.max(n1, Math.max(n2, n3));
        System.out.println("max : " + max);
        scanner.close();
    }    
}