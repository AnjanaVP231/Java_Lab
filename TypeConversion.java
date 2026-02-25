public class TypeConversion {
    public static void main(String[] args) {

        // Implicit Type Conversion (Widening)
        int num = 10;
        double d = num; // int → double
        System.out.println("Implicit Conversion (int to double): " + d);

        // Explicit Type Casting (Narrowing)
        double x = 9.78;
        int y = (int) x; // double → int
        System.out.println("Explicit Casting (double to int): " + y);
    }
}
