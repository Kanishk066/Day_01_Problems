import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a,b and c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double delta = (b*b) - (4* a * c);
        System.out.println("The value of delta: "+delta);
        double root1, root2;
        if (delta>0) {
            root1 = (-b + Math.sqrt(delta))/(2*a);
            root2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Root 1 of x = " +root1);
            System.out.println("Root 2 of x = " +root2);
        } else if (delta == 0) {
            root1 = root2 = (-b) / (2*a);
            System.out.println("Root 1 of x is = Root 2 of x=" +root1);
        }
        else {
            System.out.println("Equation has no real roots");
        }
    }
}