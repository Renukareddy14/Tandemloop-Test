import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int maxOdd;

        // If n is even, subtract 1 to get previous odd
        if (n % 2 == 0) {
            maxOdd = n - 1;
        } else {
            maxOdd = n;
        }

        // Generate 1, 3, 5, ... up to (2*maxOdd -1)
        for (int i = 0; i < maxOdd; i++) {
            System.out.print(2 * i + 1);
            if (i < maxOdd - 1) {
                System.out.print(", ");
            }
        }
    }
}
