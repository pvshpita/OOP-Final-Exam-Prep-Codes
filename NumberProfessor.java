//Q-01

import java.io.*;
import java.util.Scanner;

public class NumberProfessor {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new File("input.txt"));
        int max = 0;

        while (input.hasNextInt()) {
            int n = input.nextInt();
            if (n > max) {
                max = n;
            }
        }
        input.close();

        int sum = (max * (max + 1)) / 2;

        PrintWriter output = new PrintWriter("output.txt");
        output.println("Sum: " + sum);
        output.close();
    }
}