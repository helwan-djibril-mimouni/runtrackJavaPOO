package jour06.job05;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        double number = scanner.nextDouble();
        double square = number * number;
        System.out.println(number + " squared is " + square);
        scanner.close();
    }    
}