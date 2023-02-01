import java.util.Scanner;

public class Recursionq2 {

    public static int power(int n) {
        if (n == 0) {
            return 1;
        }
        return 2 * power(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the power: ");
        int n = sc.nextInt();
        int result = power(n);
        System.out.println("2^" + n + " = " + result);
    }
}
