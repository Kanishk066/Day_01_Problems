import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int temp = n;
        int reverse = 0;
        for (;temp != 0;temp /= 10) {
           reverse = reverse * 10 + temp % 10;
       }
        if (n==reverse) {
            System.out.println("The number is Palindrome");
        }
        else {
            System.out.println("The number is not Palindrome");
        }
    }
}
