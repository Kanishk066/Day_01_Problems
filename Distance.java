import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of x and y: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double dis = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.println("The distance will be: "+ dis);
    }
}
