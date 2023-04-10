import java.util.Scanner;
public class Invalid_Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int invalidCount = 0;

        System.out.print("Enter integers (separated by spaces): ");
        String input = scanner.nextLine() + " "; // add space to handle last integer

        int numStart = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                String numStr = input.substring(numStart, i);
                numStart = i + 1; // next number starts after the current space

                if (numStr.length() > 0) {
                    try {
                        int num = Integer.parseInt(numStr);
                        sum += num;
                    } catch (NumberFormatException e) {
                        invalidCount++;
                    }
                }
            }
        }
        System.out.println("Sum of valid integers entered: " + sum);
        System.out.println("Count of invalid integers entered: " + invalidCount);

        scanner.close();
    }
}
