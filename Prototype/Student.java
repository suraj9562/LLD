package Prototype;

public class Student implements Prototype {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new Student(id, name);
    }
}
