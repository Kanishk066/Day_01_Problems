import java.util.Scanner;
public class Single_digit_num_using_if_else {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 1) {
            System.out.println("One");
        } else if (number==2) {
            System.out.println("Two");
        } else if (number==3) {
            System.out.println("Three");
        } else if (number==4) {
            System.out.println("four");
        } else if (number==5) {
            System.out.println("five");
        } else if (number==6) {
            System.out.println("Six");
        } else if (number==7) {
            System.out.println("Seven");
        } else if (number==8) {
            System.out.println("Eight");
        } else if (number==9) {
            System.out.println("Nine");
        }

    }
}
