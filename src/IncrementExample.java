public class IncrementExample {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;

        // Using prefix increment (++x)
        int sum1 = ++x + y;
        System.out.println("Sum (prefix): " + sum1); // Should be 14

        // Reset x to 5
        x = 5;

        // Using postfix increment (x++)
        int sum2 = x++ + y;
        System.out.println("Sum (postfix): " + sum2); // Should also be 14
    }
}
