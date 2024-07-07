public class Rightshift {
    public static void main(String[] args) {
        int x = 150;

        // Print the binary string representation of x
        System.out.println("Original value of x: " + x);
        System.out.println("Binary string of x: " + Integer.toBinaryString(x));

        // Right shift x by 2
        x >>= 2; // Equivalent to x = x >> 2

        // Print the updated value of x and its binary string representation
        System.out.println("After right shift by 2: " + x);
        System.out.println("Binary string of updated x: " + Integer.toBinaryString(x));
    }
}

