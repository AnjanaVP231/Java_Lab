public class AccessSpecifiers {

    public int publicVar = 10;
    private int privateVar = 20;
    protected int protectedVar = 30;

    void display() {
        System.out.println("Private Variable: " + privateVar);
    }

    public static void main(String[] args) {
        AccessSpecifiers obj = new AccessSpecifiers();

        System.out.println("Public Variable: " + obj.publicVar);
        System.out.println("Protected Variable: " + obj.protectedVar);
        obj.display();
    }
}
