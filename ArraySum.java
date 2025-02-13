//Q-05

class ArraySum {
    static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) total += num;
        return total;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; 
        System.out.println("Sum: " + sum(numbers));
    }
}