import java.util.Scanner;

class Student {
    String name;
    int age;
    int rollNo;

    Student() { // Default Constructor
        name = "Not Assigned";
        age = 0;
        rollNo = 0;
    }

    Student(String name) { // Constructor with name
        this.name = name;
        age = 0;
        rollNo = 0;
    }

    Student(String name, int age) { // Constructor with name and age
        this.name = name;
        this.age = age;
        rollNo = 0;
    }

    Student(String name, int age, int rollNo) { // Constructor with name, age, and rollNo
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    void display() { // Method to display student details
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details for Student 1:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine(); // clear buffer

        // Creating objects using different constructors
        Student s1 = new Student();
        Student s2 = new Student(name);
        Student s3 = new Student(name, age);
        Student s4 = new Student(name, age, roll);

        System.out.println("\nStudent Details:");
        s1.display();
        s2.display();
        s3.display();
        s4.display();

        sc.close();
    }
}