import java.util.Scanner;

public class Recursionq3 {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term number: ");
        int n = sc.nextInt();
        System.out.println("Using Recursion: ");
        System.out.println("The " + n + "th term of the Fibonacci series is: " + fibonacci(n));
        System.out.println("Using For Loop: ");
        int a = 0, b = 1, c;
        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}

