//Q-08_2

public class ArrayPass {
    static void modify(int[] arr) { arr[0] = 100; } 

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        modify(numbers);
        System.out.println(numbers[0]);
    }
}