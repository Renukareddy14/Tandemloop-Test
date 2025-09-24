import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        int[] multiples = new int[10]; // index 1 to 9 will be used

        for (int num : arr) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    multiples[i]++;
                }
            }
        }

        System.out.print("{");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + ": " + multiples[i]);
            if (i < 9) System.out.print(", ");
        }
        System.out.println("}");
    }
}
