import java.util.*;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(2 * i + 1);
             if (i < n - 1) { 
                System.out.print(", ");
            }
        }

    }
}
