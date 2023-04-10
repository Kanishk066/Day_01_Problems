public class Demonstrate_Static_variables {
    static int count = 0;

    // Static block - executed once when the class is loaded
    static {
        System.out.println("Static block 1 executed");
    }

    // Static method
    public static void incrementCount() {
        count++;
    }

    // Static block - executed once when the class is loaded
    static {
        System.out.println("Static block 2 executed");
    }

    public static void main(String[] args) {
        System.out.println("Initial value of count: " + count);

        // Call static method twice
        incrementCount();
        incrementCount();

        System.out.println("Value of count after calling incrementCount() twice: " + count);
    }
}