import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, temp = n;

        while (n > 0) {
            int digit = n % 10;
            int fact = 1;
            for (int j = 1; j <= digit; j++) {
                fact = fact * j;
            }
            sum = sum + fact;
            n /= 10;
        }

        if (sum == temp) {
            System.out.println("Strong");
        } else {
            System.out.println("Not Strong");
        }
    }
}