
import java.util.*;

public class Student {
// Declare id , name, course, javaScore

    int id;
    String name;
    String course;
    String javaScore;
}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// Decalre two student object
        Student s1 = new Student();
        Student s2 = new Student();

        // Taking Input for student 1
        s1.id = sc.nextInt();
        s1.name = sc.next();
        s1.course = sc.next();
        s1.javaScore = sc.next();

//  Taking Input for student 2     
        s2.id = sc.nextInt();
        s2.name = sc.next();
        s2.course = sc.next();
        s2.javaScore = sc.next();

        System.out.println("Student Profile");
        System.out.println("Id: " + s1.id);
        System.out.println("Name: " + s1.name);
        System.out.println("Course: " + s1.course);
        System.out.println("Java Score: " + s1.javaScore);

        System.out.println("Student Profile");
        System.out.println("Id: " + s2.id);
        System.out.println("Name: " + s2.name);
        System.out.println("Course: " + s2.course);
        System.out.println("Java Score: " + s2.javaScore);
    }
}
