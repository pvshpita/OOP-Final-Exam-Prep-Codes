//Q-07

import java.util.Scanner;

public class QuadEquation {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter a, b, c: ");
        int a = read.nextInt(), b = read.nextInt(), c = read.nextInt();
        
        double D = b * b - 4 * a * c;
        if (D >= 0) {
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            
            if (root1 > 0 && root2 > 0)
                System.out.println("Smallest positive root: " + Math.min(root1, root2));
            else if (root1 > 0) System.out.println("Smallest positive root: " + root1);
            else if (root2 > 0) System.out.println("Smallest positive root: " + root2);
            else System.out.println("No real roots");
        } else {
            System.out.println("No real roots");
        }
    }
}