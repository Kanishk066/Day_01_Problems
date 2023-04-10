import java.util.Scanner;
public class Two_strings_equal_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String 1: ");
        String q = sc.next();
        System.out.println("Enter the String 2: ");
        String r = sc.next();
        if (q.equals(r)) {
            System.out.println("The two strings are equal");
        } else {
            System.out.println("The two stings are not equal");
        }
        sc.close();
    }
}







