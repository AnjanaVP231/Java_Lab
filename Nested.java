public class Nested{
    public static class OuterClass {

        class InnerClass {
            void display() {
                System.out.println("Inside Inner Class");
            }
        }
        void display_out() {
                System.out.println("Inside Outer Class");
    }
}
    public static void main(String[] args) {

        OuterClass outer = new OuterClass();
        
        OuterClass.InnerClass inner = outer.new InnerClass();
	
        inner.display();
        outer.display_out();
    }

}
