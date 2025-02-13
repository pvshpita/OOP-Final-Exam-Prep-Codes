//Q-10

class Example2 {
    static int staticVar = 10;
    int nonStaticVar = 20;

    static void staticMethod() { System.out.println("Static method"); }
    void nonStaticMethod() { System.out.println("Non-static method"); }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Example.staticVar);
        Example.staticMethod();

        Example obj = new Example();
        System.out.println(obj.nonStaticVar);
        obj.nonStaticMethod();
    }
}