package jour06.job02;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = myObj.nextLine();
        System.out.println("bonjour " + userName);
        myObj.close();
    }    
}