class This {

    int a;

    This(int a) {
        this.a = a; // refers to current class instance variable
    }

    void display() {
        System.out.println("Value of a: " + this.a);
    }

    public static void main(String[] args) {
        This obj = new This(50);
        obj.display();
    }
}