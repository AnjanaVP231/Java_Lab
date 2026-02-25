public class Nested {

    static class OuterClass {

        class InnerClass {
            void display() {
                System.out.println("Inside Inner Class");
            }
        }
    }

    public static void main(String[] args) {

        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();

        inner.display();
    }
}