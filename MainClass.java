//Q-12

class BaseClass {
    void print(String label, String result) {
        System.out.println(label + ": " + result);
    }
}

class SumClass extends BaseClass {
    double computeSum() {
        double sum = 0;
        for (double i = 1.0; i >= 0.01; i -= 0.1) sum += i;
        return sum;
    }
}

class DivisorMultipleClass extends BaseClass {
    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}

class NumberConversionClass extends BaseClass {
    String toBinary(int num) {
        return Integer.toBinaryString(num);
    }
    String toHex(int num) {
        return Integer.toHexString(num).toUpperCase();
    }
    String toOctal(int num) {
        return Integer.toOctalString(num);
    }
}

class CustomPrintClass extends BaseClass {
    void PR(String message) {
        System.out.println("\033[1m" + message + "\033[0m");
    }
}

public class MainClass {
    public static void main(String[] args) {
        SumClass sumObj = new SumClass();
        sumObj.print("Series Sum", String.valueOf(sumObj.computeSum()));

        DivisorMultipleClass dmObj = new DivisorMultipleClass();
        int num1 = 36, num2 = 48;
        dmObj.print("GCD", String.valueOf(dmObj.gcd(num1, num2)));
        dmObj.print("LCM", String.valueOf(dmObj.lcm(num1, num2)));

        NumberConversionClass ncObj = new NumberConversionClass();
        int number = 29;
        ncObj.print("Binary", ncObj.toBinary(number));
        ncObj.print("Hex", ncObj.toHex(number));
        ncObj.print("Octal", ncObj.toOctal(number));

        new CustomPrintClass().PR("End of Program");
    }
}