interface Parent1 {
    void showParent1();
}
interface Parent2 {
    void showParent2();
}

// Child class implementing two interfaces
class Child implements Parent1, Parent2 {
    public void showParent1() {
        System.out.println("This is Parent1 Interface Method");
    }
    public void showParent2() {
        System.out.println("This is Parent2 Interface Method");
    }
    void display() {
        System.out.println("Child class inherits properties of Parent1 and Parent2 using interfaces");
    }
}

public class Interface {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.showParent1();
        obj.showParent2();
        obj.display();
    }
}
