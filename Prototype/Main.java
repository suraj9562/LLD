package Prototype;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(10, "Ram");
        Student studentClone = (Student) student.clone();
    }
}
