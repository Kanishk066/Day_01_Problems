import java.util.Scanner;
public class Sum_of_n_natural_num_using_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        while (i<=n) {
            sum +=i;
            i++;
        }
        System.out.println("The sum of the number is " + sum);
    }
}
