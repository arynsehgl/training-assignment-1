import java.util.Scanner;

public class recursionq1 {

    public static void count(int n) {
        if (n == 0) {
            return;
        }
        count(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count: ");
        int n = sc.nextInt();
        count(n);
    }
}
