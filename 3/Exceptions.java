import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int a, b;

            System.out.println("Enter first number:");
            a = sc.nextInt();

            System.out.println("Enter second number:");
            b = sc.nextInt();

            int result = a / b;
            System.out.println("Result = " + result);

            int arr[] = {1,2,3,4};
            System.out.println(arr[5]);

        }

        catch(ArithmeticException e) {
            System.out.println("Division by zero error!\n"+e);
        }

        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound!\n"+e);
        }

        catch(Exception e) {
            System.out.println("Other exception occurred\n"+e);
        }

        finally {
            System.out.println("Program finished.");
        }
    }
}
