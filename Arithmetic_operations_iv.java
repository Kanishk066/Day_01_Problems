import java.util.Scanner;
public class Arithmetic_operations_iv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        float a = sc.nextFloat();
        System.out.println("Enter number b: ");
        float b = sc.nextFloat();
        System.out.println("Enter number c: ");
        float c = sc.nextFloat();
        float z = a*b+c;
        float max = Math.max((Math.max(a, b)), (Math.max(b, c)));
        float min = Math.min((Math.min(a, b)), (Math.min(b, c)));
        System.out.println("The result is: " + z);
        System.out.println("Max value is: " + max);
        System.out.println("Min value is: " + min);
    }
}
