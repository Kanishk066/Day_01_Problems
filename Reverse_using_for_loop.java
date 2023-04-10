import java.util.Scanner;
public class Reverse_using_for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int reverse = 0;
        for (; n!=0;n/=10) {
            int digit = n%10;
            reverse = reverse * 10 + digit;
        }
        System.out.println("The reverse of the number is: " +reverse);

    }
}
