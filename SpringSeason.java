import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month: ");
        int m = sc.nextInt();
        System.out.println("Enter date: ");
        int d = sc.nextInt();
        if ((m==3 && d>=20) || (m==4 || m==5) || (m==6 && d<=20)) {
            System.out.println("Spring");
        }
        else {
            System.out.println("not Spring");
        }
    }
}
