public class MethodOverriding {
    public static void main(String[] args) {
        class Parent {
            void show() {
                System.out.println("Parent class method");
            }
        }

        class Child extends Parent {
            void show() {
                System.out.println("Child class method");
            }

        }
        Child obj = new Child();
        obj.show();
    }
}
