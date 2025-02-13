//Q-03

import java.util.Scanner;

public class FactorionCalc {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int start = input.nextInt();
    int end = input.nextInt();

    int cnt = 0;

    for(int i = start; i <= end; ++i) {
      int sum = 0, hudai = i;

      while(hudai > 0) {
int dig = hudai % 10;
int fac = 1;

        for(int j = 1; j <= dig; ++j) {
 fac *= j;
        }

        sum += fac;
        hudai /= 10;
      }

      if (sum == i) {
        cnt ++;
      }
    }

  System.out.println(cnt);

  input.close();
  }
}