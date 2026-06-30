
import java.util.Scanner;

public class PowerWithoutPow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Base: ");
        int x = sc.nextInt();

        System.out.print("Enter Exponent: ");
        int n = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= x;
        }

        System.out.println("Result = " + result);
    }
}
