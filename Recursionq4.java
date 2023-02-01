import java.util.Scanner;

public class Recursionq4 {

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        System.out.println("Using Recursion: ");
        System.out.println("The sum of the first " + n + " numbers is: " + sum(n));
        System.out.println("Using For Loop: ");
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of the first " + n + " numbers is: " + sum);
    }
}
