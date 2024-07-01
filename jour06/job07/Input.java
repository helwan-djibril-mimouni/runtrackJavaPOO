package jour06.job07;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;  
        int number;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + " : ");
            number = scanner.nextInt();
            sum += number;
        }
        number = sum / 5;
        System.out.println("Average is : " + number);
        scanner.close();
    }    
}