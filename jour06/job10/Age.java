package jour06.job10;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age :");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("Too young");
        } else {
            System.out.println("Old enough");
        }
        scanner.close();
    }    
}