public class LeftShift {
    public static void main(String[] args) {
        // Initialize x with the value 2
        int x = 2;

        // Print the binary representation of x
        System.out.println("Initial value of x: " + Integer.toBinaryString(x));

        // Left shift x by 1 position
        x <<= 1; // Equivalent to x = x << 1

        // Print the updated value of x
        System.out.println("After left shift by 1 position:");
        System.out.println("Decimal value of x: " + x);
        System.out.println("Binary representation of x: " + Integer.toBinaryString(x));

        // Repeat the process for other values
        int[] values = {9, 17, 88};
        for (int value : values) {
            System.out.println("\nFor value " + value + ":");
            System.out.println("Decimal value: " + value);
            System.out.println("Binary representation: " + Integer.toBinaryString(value));
        }
    }
}

