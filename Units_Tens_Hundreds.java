import java.util.Scanner;
public class Units_Tens_Hundreds {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 1 || num > 1000 ) {
            System.out.println("Invalid Input!");
        }
        else {
            int units = num % 10;
            int tens = (num / 10) % 10;
            int hundreds = (num / 100) %10;
            System.out.println("unit digit" +units);
            System.out.println("tens digit" +tens);
            System.out.println("hundreds digit" +hundreds);
        }
    }
}
