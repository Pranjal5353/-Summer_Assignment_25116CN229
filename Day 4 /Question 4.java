
import java.util.Scanner;

public class ArmstrongInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start of range: ");
        int start = sc.nextInt();

        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers in the range:");

        for (int num = start; num <= end; num++) {
            int original = num;
            int sum = 0;

            int digits = String.valueOf(num).length();

            int temp = num;
            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == original) {
                System.out.print(original + " ");
            }
        }

        sc.close();
    }
}
