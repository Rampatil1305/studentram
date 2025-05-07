public class Studentcourse{
    String name;
    int age;
    String dob;
    Studentcourse(String name, int age, String dob){
        this.name = name;
        this.age = age;
        this.dob = dob;

    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Date of Birth: "+dob);
    }
    public static void main(String[] args) {
        Studentcourse student = new Studentcourse("John Doe", 20, "01/01/2003");
        student.display();
    }
}