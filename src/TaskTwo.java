import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer N: ");
        int n = scanner.nextInt();

        System.out.println("Even numbers:");
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println();
        System.out.println("Count: " + count);

        scanner.close();
    }
}