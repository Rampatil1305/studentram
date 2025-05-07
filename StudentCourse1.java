

public class StudentCourse1 {
    int sem;
    int marks;
    String sub;

    StudentCourse1(int sem, int marks,String sub) {
        this.sem = sem;
        this.marks = marks;
        this.sub = sub;
    }
    void display() {
        System.out.println("Semester: " + sem);
        System.out.println("Marks: " + marks);
        System.out.println("Subject: " + sub);
    }
    public static void main(String[] args) {
        StudentCourse1 student = new StudentCourse1(2, 85, "maths");
        StudentCourse1 student1 = new StudentCourse1(3, 90, "science");
        student.display();
        student1.display();
    }
}
