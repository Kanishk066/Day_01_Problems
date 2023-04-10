import java.util.Scanner;

public class Arithmetic_operations_ii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = sc.nextInt();
        System.out.println("Enter number b: ");
        int b = sc.nextInt();
        System.out.println("Enter number c: ");
        int c = sc.nextInt();
        int z = c+a/b;
        int max = Math.max((Math.max(a, b)), (Math.max(b, c)));
        int min = Math.min((Math.min(a, b)), (Math.min(b, c)));
        System.out.println("The result is: " + z);
        System.out.println("Max value is: " + max);
        System.out.println("Min value is: " + min);
    }
}
