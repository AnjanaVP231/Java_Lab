import java.util.Scanner;

public class SumOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range: ");
        int n = sc.nextInt();

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        System.out.println("Sum of Even numbers: " + sumEven);
        System.out.println("Sum of Odd numbers: " + sumOdd);

        sc.close();
    }
}