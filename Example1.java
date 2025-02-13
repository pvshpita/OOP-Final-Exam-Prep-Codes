//Q-02

class Example1 {
    static int statField = 10;
    static void statMeth() {
        System.out.println("Static method called");
    }
}

public class Test {
    public static void main(String[] args) {
        Example obj = new Example();
        Example.statMeth();
        obj.statMeth();
    }
}