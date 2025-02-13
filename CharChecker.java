//Q-08

import java.util.Scanner;

public class CharChecker {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        char ch = read.next().charAt(0);
        
        if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
            System.out.println("It is a letter.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("It is a digit.");
        } else if (ch == ' ' || ch == '\t' || ch == '\n') {
            System.out.println("It is a whitespace.");
        } else {
            System.out.println("It is a special character.");
        }
        
        read.close();
    }
}