import java.util.Scanner;
public class Get_the_name_using_command_line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str1 = sc.nextLine();
        System.out.println("Hello " +str1+ "!");

    }
}
