//Q-10_2

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = read.nextLine();
        System.out.println(s.equals(new StringBuilder(s).reverse().toString()) ? "It is a palindrome." : "Not a palindrome.");

        System.out.print("Enter number: ");
        int num = read.nextInt();
        System.out.println(num == new StringBuilder(String.valueOf(num)).reverse().toString().toInt() ? "It is a palindrome." : "Not a palindrome.");

        read.close();
    }
}